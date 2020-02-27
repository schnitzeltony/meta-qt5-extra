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
SRC_URI[md5sum] = "f72e5e095a38ba6937d6a6c8dee57af3"
SRC_URI[sha256sum] = "3896296124a99333353445331496c5d2da414dc0c5174747ddf6fcce833e76f1"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
