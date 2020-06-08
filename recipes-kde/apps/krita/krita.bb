SUMMARY = "Krita is a free digital painting application"
LICENSE = "GPLv3 & BSD"
HOMEPAGE = "https://krita.org/"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps python3native gtk-icon-cache mime-xdg

DEPENDS += " \
    qtmultimedia \
    quazip \
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

PV = "4.2.9"
PVEXT = ""
SRC_URI = " \
    ${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}${PVEXT}.tar.gz \
    file://0001-Fix-build-with-Qt-5.15.patch \
"
SRC_URI[md5sum] = "670d5a1855277c42745e3a46157917da"
SRC_URI[sha256sum] = "9f85bb81eaf4976af57352a482af1fdb86f338051a991f6f43976e0b65956da8"
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
