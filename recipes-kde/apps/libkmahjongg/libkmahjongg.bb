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
SRC_URI[sha256sum] = "ce8de9d665fd72c288dede91488fe390a0123e2b65e50a9e136c1337924d872b"

FILES:${PN} += " \
    ${datadir}/kmahjongglib \
"
