SUMMARY = "KWRITED"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

DEPENDS += " \
    kcoreaddons \
    ki18n \
    kpty \
    knotifications \
    kdbusaddons \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "9f4af965c183e8b4b8311ba3d8e3909c"
SRC_URI[sha256sum] = "41bdcbf600d8d3ec4c769c2f82bb2a6f05db0f11a15e35e32e5acb736f4e89c0"

SRC_URI += "file://0001-fix-build-for-qtbase-without-session-management.patch"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
