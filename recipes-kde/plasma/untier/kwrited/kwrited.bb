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
SRC_URI[sha256sum] = "a380d4631f9887dd1a36e11d7afe3a7b5d7039b4cf70c41c5e4d1d357304c276"

FILES:${PN} += " \
    ${datadir}/knotifications5 \
"
