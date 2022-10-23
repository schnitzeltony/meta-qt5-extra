SUMMARY = "Plugins for Dolphin"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdelibs4support-native \
    kdelibs4support \
    sonnet-native \
    kxmlgui \
    ki18n \
    kio \
    dolphin \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "036f2acd9240342dbcea73c3cac7a01977e74626490303fa8bddaacd34213925"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
