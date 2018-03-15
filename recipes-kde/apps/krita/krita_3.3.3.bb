SUMMARY = "Krita is a free digital painting application"
LICENSE = "GPLv3 & BSD"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    qtmultimedia \
    curl \
    poppler \
    boost \
    libraw \
    libeigen \
    exiv2 \
    fftw \
    \
    kauth-native \
    karchive \
    kconfig-native \
    kwidgetsaddons \
    kcompletion \
    kcoreaddons-native \
    kguiaddons \
    ki18n \
    kitemmodels \
    kitemviews \
    kwindowsystem \
    kio \
    kcrash \
"

SRC_URI = " \
    ${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-fix-build-with-GLES2-only.patch \
"
SRC_URI[md5sum] = "eb3224bbf09b7b88364c6308cd5a5d18"
SRC_URI[sha256sum] = "bec04e3392e9b311477c5c6a50e2201b43a3afda91d9b24a0fc8e3399585865d"

OECMAKE_GENERATOR="Unix Makefiles"

# krita has lots of include_directories(SYSTEM ${FOO_DIR})
# have no better way to make gcc6 happy
do_configure_append() {
     for makefile in `find ${B} -name *.make` ; do
         sed -i 's:-isystem:-I:g' $makefile
     done
}

# HACK - but overidable by BSP
LDFLAGSGL = "-lGLESv2"
LDFLAGS += "${LDFLAGSGL}"

FILES_${PN} += " \
    ${datadir}/color \
    ${datadir}/color-schemes \
    ${datadir}/icons \
    ${datadir}/kritaplugins \
    ${libdir}/kritaplugins \
"
