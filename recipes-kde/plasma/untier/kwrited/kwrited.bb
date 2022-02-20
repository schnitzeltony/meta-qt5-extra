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
SRC_URI[sha256sum] = "0151f1afa0895b366b3d79878e1b3118a7630fa24c10b326560d1e0ea8daa156"

FILES:${PN} += " \
    ${datadir}/knotifications5 \
"
