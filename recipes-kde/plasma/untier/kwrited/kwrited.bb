SUMMARY = "KWriteD: Listen to traditional system notifications"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
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
SRC_URI[sha256sum] = "c934d9c85581db575da0559713f1c0bba0541749ea36a51f9cbce7454c2af4db"
SRC_URI += "file://0001-fix-build-for-qtbase-without-session-management.patch"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
