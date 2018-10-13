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
SRC_URI[md5sum] = "c2fee9478e4b373f40e6e4a650124f00"
SRC_URI[sha256sum] = "88857eb2d60f6b007e02c58305c0be18c0289a6e5069b08dcd76878838b6ed15"

FILES_${PN} += " \
    ${datadir}/kmahjongglib \
"
