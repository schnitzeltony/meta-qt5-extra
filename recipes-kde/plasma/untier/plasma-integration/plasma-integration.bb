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
SRC_URI[md5sum] = "e28dff65bbde4ed297154934c671ac19"
SRC_URI[sha256sum] = "437cfef7c1a7de3b422e7003850025355a759d50514cfcb6cab2e5e5aaefcfa4"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
