SUMMARY = "KDE file find utility"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-apps gettext gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    karchive \
    kfilemetadata \
    ki18n \
    kio \
    ktextwidgets \
    kwidgetsaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "a0ff3b4a44b938f7f336d4c2fbc302d8a55612b089ee954b2d98ec5f97ee3eec"

FILES:${PN} += " \
    ${datadir}/icons \
"
