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
SRC_URI[sha256sum] = "02f070f2ad8912814a3a26ee23eaa9a8abf5e22ba2c19c42b2776fe3a6620146"

FILES_${PN} += " \
    ${datadir}/kmahjongglib \
"
