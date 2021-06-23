SUMMARY = "KWriteD: Listen to traditional system notifications"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-plasma gettext

DEPENDS += " \
    kcoreaddons \
    kcoreaddons-native \
    ki18n \
    kpty \
    knotifications \
    kdbusaddons \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "52748d812dd28ea617c8f42d2e2aa39d589e08f69406fb207e9c6ad1078a9e1e"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
