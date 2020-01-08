SUMMARY = "KINFOCENTER"
LICENSE = "GPLv2 & LGPLv2.1 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gettext

DEPENDS += " \
    pciutils \
    kcompletion \
    kauth-native \
    kconfig \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons \
    kcoreaddons-native \
    kdbusaddons \
    kdoctools \
    kdoctools-native \
    ki18n \
    kiconthemes \
    kcmutils \
    kpackage-native \
    sonnet-native \
    kio \
    kservice \
    solid \
    kwidgetsaddons \
    kxmlgui \
"

# REVISIT optionals
DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "36bdb8bdbaaf7aae1699f09c7ff3c0a9"
SRC_URI[sha256sum] = "679870f10ee6494136d87a897a57a23c2905054d7a83ff11a4e85c204eb9fd9a"
SRC_URI += "file://0001-fix-build-in-x11-less-environments.patch"

FILES_${PN} += " \
    ${datadir}/kcmusb \
    ${datadir}/desktop-directories \
    ${datadir}/k*5 \
    ${datadir}/kpackage \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
"
