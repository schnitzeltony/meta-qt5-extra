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
    giflib \
    gsl \
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

PV = "4.4.2"
PVEXT = ""
SRC_URI = " \
    ${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}${PVEXT}.tar.xz \
    file://0001-Make-C++14-default.patch \
"
SRC_URI[sha256sum] = "1ee503afc86178e1abbae63e8334e26116a6779aa9ef202656a1c35b76932e88"
S = "${WORKDIR}/${BPN}-${PV}${PVEXT}"

FILES_${PN} += " \
    ${datadir}/color \
    ${datadir}/color-schemes \
    ${datadir}/icons \
    ${datadir}/kritaplugins \
    ${libdir}/kritaplugins \
    ${OE_QMAKE_PATH_QML}/org/krita \
"
