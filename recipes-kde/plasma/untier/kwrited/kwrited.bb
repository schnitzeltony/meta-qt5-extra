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
SRC_URI[sha256sum] = "8708c5f41dd32531a25bd9099cd15c39439769f7c17e4481b44f9f7572f03ac3"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
