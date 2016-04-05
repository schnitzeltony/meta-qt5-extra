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
SRC_URI[md5sum] = "92ca420cda218419809928e12580a133"
SRC_URI[sha256sum] = "63d61a5b367d7a97884f2b3c890645747450f18b6e738283e3701d279f61357c"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
    file://0002-remove-usage-of-QGuiApplication-setFallbackSessionMa.patch \
"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
