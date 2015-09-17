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
SRC_URI[md5sum] = "6064bd41f2a7cdbe97a5be84e1a87fe3"
SRC_URI[sha256sum] = "3ab7a94c180bbe8e929cfc4b52202e48f7cb3a890c82ec7fade305e7357a2a78"

SRC_URI += "file://0001-fix-build-for-qtbase-without-session-management.patch"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
