SUMMARY = "Krita is a free digital painting application"
LICENSE = "GPLv3 & BSD"
HOMEPAGE = "https://krita.org/"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps python3native gtk-icon-cache

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

PVEXT = ".101"
SRC_URI = " \
    ${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}${PVEXT}.tar.gz \
"
SRC_URI[md5sum] = "a172b864ca7723b5a033fdc730d9296c"
SRC_URI[sha256sum] = "5bc95baa3980b7d75eb6bf103f72344014eac7733fd8a0780a7ec87dc2826f5f"
S = "${WORKDIR}/${BPN}-${PV}${PVEXT}"

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
    ${OE_QMAKE_PATH_QML}/org/krita \
"
