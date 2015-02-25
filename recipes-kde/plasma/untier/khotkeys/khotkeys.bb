SUMMARY = "KHOTKEYS"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma

DEPENDS += " \
    kglobalaccel \
    ki18n \
    kio \
    kxmlgui \
    kdelibs4support \
    kdbusaddons \
    kcmutils \
    plasma-framework \
    plasma-workspace \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "f9124cc0364fbbe5c7693a58214c306c"
SRC_URI[sha256sum] = "56bff62ce53325a6ef8ad91ee8f39d7c8184f3c793a0a657d58a748ea7b75004"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/dbus-1 \
    ${libdir}/plugins \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
"
