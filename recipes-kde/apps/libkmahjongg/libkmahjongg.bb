SUMMARY = "Common code, backgrounds and tile sets for Mahjongg games"
LICENSE = "GPLv2 & GFDL-1.2"
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
SRC_URI[md5sum] = "a2ffeb6f68f7a84ad6e01c2a58b12708"
SRC_URI[sha256sum] = "25e5cea50b6c96f18efa8d013ab58abfaac7845edb969b8e63e0c297482a6be4"

FILES_${PN} += " \
    ${datadir}/kmahjongglib \
"
