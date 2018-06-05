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
"
SRC_URI[md5sum] = "38f5955277e6e544922ebc7272f503c7"
SRC_URI[sha256sum] = "f9ead78ff4b184af49aea59385b0cfa1238ebf7fd527bf2f408c59fc5b12b67e"

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
