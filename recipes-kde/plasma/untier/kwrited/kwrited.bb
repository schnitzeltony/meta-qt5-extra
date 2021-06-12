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
SRC_URI[sha256sum] = "069eeb75d8c8a23f4b8524f94d980129099a8fb076c3f09c086fca6046980319"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
