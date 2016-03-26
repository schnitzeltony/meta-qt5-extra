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
SRC_URI[md5sum] = "cb7831be19e51c6d4ec2f62024726998"
SRC_URI[sha256sum] = "41bcde691465598fe817aab1306c4761a928c70d8d6092909a50ade961bb754b"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
    file://0002-remove-usage-of-QGuiApplication-setFallbackSessionMa.patch \
"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
"
