SUMMARY = "Common code, backgrounds and tile sets for Mahjongg games"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
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
SRC_URI[sha256sum] = "456237e07c47dd82d9a79fa9b8c818b74a29f7315e8345e76e2772f6da02876e"

FILES:${PN} += " \
    ${datadir}/kmahjongglib \
"
