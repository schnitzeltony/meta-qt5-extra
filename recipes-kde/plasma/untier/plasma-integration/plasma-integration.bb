SUMMARY = "Qt Platform Theme integration plugins for the Plasma workspaces"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma

DEPENDS += " \
    breeze \
    kconfig \
    kconfigwidgets \
    ki18n \
    kio \
    knotifications \
    kwidgetsaddons \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "5f950d13d8715162ea4bdfec73e06b7d"
SRC_URI[sha256sum] = "140e38073ab90c4deb11ac06586a9ea355d9637068ae8df45dc4994a9cac9cf2"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
