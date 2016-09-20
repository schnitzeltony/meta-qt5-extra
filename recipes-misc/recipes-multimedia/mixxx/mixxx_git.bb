SUMMARY = "Qt based DJ software"
HOMEPAGE = "http://mixxx.org/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb18019490a2ef1942831060527e3feb"

inherit scons

DEPENDS += " \
    qtbase \
    qtscript \
    qtsvg \
    libusb1 \
    hidapi \
    upower \
    sqlite \
    gperftools \
    libid3tag \
    taglib \
    libmad \
    faad2 \
    libmp4v2 \
    libogg \
    libvorbis \
    protobuf \
    fftw \
    portaudio-v19 \
    portmidi \
    chromaprint \
    rubberband \
    soundtouch \
"

SRC_URI = " \
    git://github.com/mixxxdj/${BPN}.git \
    file://0001-do-not-check-for-known-machine-types.patch \
    file://0002-force-using-system-soundtouch.patch \
    file://0003-coverart.cpp-fix-build-with-gcc-6-for-Qt5.patch \
"
SRCREV = "ba6150137a5a85bce292cde34f0efd107aa89143"
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
    shoutcast=0 \
    localecompare=0 \
    faad=1 \
    perftools=1 \
    ${EXTRA_OESCONS_GL} \
"

# TODO faad not detected libmp4v2

do_install_prepend() {
    install -d ${D}${prefix}
    sed -i 's:/etc/udev:${D}/etc/udev:g' ${S}/src/SConscript
}

FILES_${PN} += "${datadir}/appdata"
