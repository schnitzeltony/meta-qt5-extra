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
SRC_URI[md5sum] = "982d467873d0328bd37588df4dd62996"
SRC_URI[sha256sum] = "02302e83eaa64b8015b6d084644fb2c48f3fa3db5ff7c01cdc6abb8ad4c6d921"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
