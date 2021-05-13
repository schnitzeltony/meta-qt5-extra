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
SRC_URI[sha256sum] = "e1e79046b9657defa5074e46f7bcb09e9000f6e4bc3504eda9363fc60891294e"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
