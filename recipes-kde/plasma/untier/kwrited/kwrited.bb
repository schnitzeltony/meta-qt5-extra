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
SRC_URI[md5sum] = "207040832d0a2878b0ce5dd41c8d2888"
SRC_URI[sha256sum] = "a93fd5f0ce17f950cc212c345e44279fea92919bd0fcfee7b3a32a1691beefad"

SRC_URI += "file://0001-fix-build-for-qtbase-without-session-management.patch"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
