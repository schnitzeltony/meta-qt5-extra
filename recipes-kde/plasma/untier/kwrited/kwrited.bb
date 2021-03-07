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
SRC_URI[sha256sum] = "afed5c80700cfae4db18b22ddfdefeaaf72fe21f85188b2003b691dc94a211d0"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
