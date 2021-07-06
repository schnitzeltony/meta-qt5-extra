SUMMARY = "Krita is a free digital painting application"
LICENSE = "GPL-3.0 & BSD-3-Clause"
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

PV = "4.4.5"
PVEXT = ""
SRC_URI = " \
    ${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}${PVEXT}.tar.xz \
    file://0001-Make-C++14-default.patch \
"
SRC_URI[sha256sum] = "84c53686056d8f7485658004ca454eb275e35221307362e65daaac934a5c3b78"
S = "${WORKDIR}/${BPN}-${PV}${PVEXT}"

FILES_${PN} += " \
    ${datadir}/color \
    ${datadir}/color-schemes \
    ${datadir}/icons \
    ${datadir}/kritaplugins \
    ${libdir}/kritaplugins \
    ${OE_QMAKE_PATH_QML}/org/krita \
"
