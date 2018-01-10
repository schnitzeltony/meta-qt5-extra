SUMMARY = "KWRITED"
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
SRC_URI[md5sum] = "124663bcbd28d4f5640740c1888068ff"
SRC_URI[sha256sum] = "7b69d365b39d9af4f52faddcdeeffa1c53bea9b873365b0d476b557555d8a56b"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
