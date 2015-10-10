SUMMARY = "KDiamond is a single player puzzle game"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps

DEPENDS += "\
    kcoreaddons \
    kconfig \
    kdbusaddons \
    kdoctools \
    kwidgetsaddons \
    ki18n \
    kguiaddons \
    kconfigwidgets \
    kiconthemes \
    kxmlgui \
    knotifications \
    knotifyconfig \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "1bfc2a77d358a34aa84202bdf09ac9c0"
SRC_URI[sha256sum] = "f53f152c9891a1e6de29f0d74b29806d36518868ec5ab0cbcaf1666eafa101b9"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
"
