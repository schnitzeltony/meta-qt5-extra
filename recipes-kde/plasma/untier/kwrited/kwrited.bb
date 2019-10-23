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
SRC_URI[md5sum] = "541d88cacb3b5e709414b6bedbde411d"
SRC_URI[sha256sum] = "7434553cd7b60380c5960d0f6e8bf363f544d45ef7e1aed1b9b3c98bceeb1bf2"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
