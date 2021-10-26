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
SRC_URI[sha256sum] = "a4bd2d821583a5dce053c45daf2f85d38a5048593d1b614609bb2cffdfc0eab3"

FILES:${PN} += " \
    ${datadir}/knotifications5 \
"
