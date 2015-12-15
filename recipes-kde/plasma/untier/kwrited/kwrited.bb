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
SRC_URI[md5sum] = "532c4c6c84d13e4338d07570edd81916"
SRC_URI[sha256sum] = "60e00ecc2d43026b70c3a896c540c9f93bab8886a637507aaf4b682ac90e3636"

SRC_URI += "file://0001-fix-build-for-qtbase-without-session-management.patch"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
