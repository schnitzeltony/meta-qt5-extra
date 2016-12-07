SUMMARY = "Qt based DJ software"
HOMEPAGE = "http://mixxx.org/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb18019490a2ef1942831060527e3feb"

inherit scons qmake5_paths

DEPENDS += " \
    qtbase \
    qtscript \
    qtsvg \
    qtxmlpatterns \
    qttools-native \
    libusb1 \
    hidapi \
    upower \
    sqlite \
    libid3tag \
    taglib \
    libmad \
    faad2 \
    libmp4v2 \
    libogg \
    libvorbis \
    protobuf protobuf-native \
    fftw \
    portaudio-v19 \
    portmidi \
    chromaprint \
    rubberband \
    soundtouch \
"
# causes segfault trying to find debug libs
#    gperftools

SRC_URI = " \
    git://github.com/mixxxdj/${BPN}.git \
    file://0001-do-not-check-for-known-machine-types.patch \
    file://0002-force-using-system-soundtouch.patch \
    file://0003-align-path-of-qt-build-tools-to-our-needs.patch \
"
SRCREV = "14e10b29b57ae46ff8bb9ac0b815f8a4cb475848"
S = "${WORKDIR}/git"
PV = "2.0.0+git${SRCPV}"

EXTRA_OESCONS_GL ??= " \
    opengles=1 \
"

EXTRA_OESCONS += " \
    build=release \
    target=linux \
    machine=${TARGET_ARCH} \
    qt5=1 \
    qtdir=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS} \
    shoutcast=0 \
    localecompare=0 \
    faad=1 \
    ${EXTRA_OESCONS_GL} \
"
#    perftools=1

do_install_prepend() {
    install -d ${D}${prefix}
    sed -i 's:/etc/udev:${D}/etc/udev:g' ${S}/src/SConscript
}

FILES_${PN} += "${datadir}/appdata"
