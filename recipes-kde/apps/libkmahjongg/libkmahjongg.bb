SUMMARY = "Common code, backgrounds and tile sets for Mahjongg games"
LICENSE = "GPL-2.0 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    qtsvg \
    kauth-native \
    kcoreaddons-native \
    kconfig-native \
    kconfigwidgets \
    kwidgetsaddons  \
    kcompletion  \
    ki18n \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "d8bd7cf2ac1cf3e5c2616849eaddc513c2a8f45c795ad53c75254e7cdcfa9282"

FILES_${PN} += " \
    ${datadir}/kmahjongglib \
"
