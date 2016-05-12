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
SRC_URI[md5sum] = "7a24ff9cfe4e1650b98164c916993fe8"
SRC_URI[sha256sum] = "95f434801f23f2ffbbb2df6dcb19ef1373ef942919bc5a133adca8c59e1a1bab"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
