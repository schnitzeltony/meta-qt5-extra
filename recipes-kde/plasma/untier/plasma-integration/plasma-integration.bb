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
SRC_URI[md5sum] = "b3d76e7a991ae50a28fbc34288e73e43"
SRC_URI[sha256sum] = "c754aeed43dbf51c32094fe150d1243fcc4cd9817cc7e35765ccb157ac3dccf5"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
