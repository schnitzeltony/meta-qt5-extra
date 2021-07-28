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
SRC_URI[sha256sum] = "9158fb7dc963e01c356cf5572910d72e2914a749e3dd46956898a35d1c5e73e5"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
