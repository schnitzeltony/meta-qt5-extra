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
SRC_URI[sha256sum] = "11d6b4396fd86cb2fd4c2445222bb9ef8aa9522afe2d572880016ff7b5eb5ea3"

FILES:${PN} += " \
    ${datadir}/kmahjongglib \
"
