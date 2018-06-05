SUMMARY = "Qt based DJ software"
HOMEPAGE = "http://mixxx.org/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e029b0dfdd8cfff5e40a3741234b1ca7"

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
    libglu \
"
# causes segfault trying to find debug libs
#    gperftools

SRC_URI = " \
    git://github.com/mixxxdj/${BPN}.git;branch=2.1 \
    file://0001-do-not-check-for-known-machine-types.patch \
    file://0002-force-using-system-soundtouch.patch \
    file://0003-align-path-of-qt-build-tools-to-our-needs.patch \
    file://0004-add-vamp-float-math-build-option-to-force-vamp-calcu.patch \
"
SRCREV = "55b4f3e0a67d27f94d55c0c5152e53fc138dea7c"
S = "${WORKDIR}/git"
PV = "2.1.0+git${SRCPV}"

EXTRA_OESCONS_MATH ??= " \
    vampfloatmath=1 \
"

# qtbase is expected to be build for desktop GL. If there is qtbase with gles
# add opengles=1 to EXTRA_OESCONS but that currently disables code paths and
# wave displays remain empty
EXTRA_OESCONS += " \
    build=release \
    target=linux \
    machine=${TARGET_ARCH} \
    qt5=1 \
    qtdir=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS} \
    shoutcast=0 \
    localecompare=0 \
    faad=1 \
    ${EXTRA_OESCONS_MATH} \
"
#    perftools=1

do_install_prepend() {
    install -d ${D}${prefix}
    sed -i 's:/etc/udev:${D}/etc/udev:g' ${S}/src/SConscript
}

FILES_${PN} += "${datadir}/appdata"
