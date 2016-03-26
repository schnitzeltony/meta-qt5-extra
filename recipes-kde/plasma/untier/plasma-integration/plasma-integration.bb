SUMMARY = "Qt Platform Theme integration plugins for the Plasma workspaces"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma

DEPENDS += " \
    kconfig \
    kconfigwidgets \
    ki18n \
    kio \
    knotifications \
    kwidgetsaddons \
    kwayland \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c26be1b6ed15604accf8f725c068279a"
SRC_URI[sha256sum] = "f8909c30c35f4dccfaeed93386b5f9e911f06c43336fadf400620068f2d71e18"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
