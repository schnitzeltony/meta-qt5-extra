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

PV = "4.4.3"
PVEXT = ""
# odd: could unpack 4.4.3 tar.xz -> temp tar.gz
SRC_URI = " \
    ${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}${PVEXT}.tar.gz \
    file://0001-Make-C++14-default.patch \
"
SRC_URI[sha256sum] = "d4062323c2237ab9195c0b8bce1a69e30bd6fd10fadbad6395c27211d9878f67"
S = "${WORKDIR}/${BPN}-${PV}${PVEXT}"

FILES_${PN} += " \
    ${datadir}/color \
    ${datadir}/color-schemes \
    ${datadir}/icons \
    ${datadir}/kritaplugins \
    ${libdir}/kritaplugins \
    ${OE_QMAKE_PATH_QML}/org/krita \
"
