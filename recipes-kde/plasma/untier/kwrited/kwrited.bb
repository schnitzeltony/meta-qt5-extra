SUMMARY = "KWriteD: Listen to traditional system notifications"
LICENSE = "GPL-2.0"
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
SRC_URI[sha256sum] = "bfb2bb88e6b4e49a69b5c90b4688f3aba3b8e6771221e7c9332293bfc05a1bc0"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
