SUMMARY = "	KWriteD: Listen to traditional system notifications"
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
SRC_URI[md5sum] = "512ac96934d795777823abd81d1a6989"
SRC_URI[sha256sum] = "fead2852cbafe7dfbe2e57f7a46c3e6ad5ab0c1f17be7d1da4d5baee77b55a54"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
