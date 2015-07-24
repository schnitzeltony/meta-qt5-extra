SUMMARY = "LXQt Qt platform integration plugin"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "liblxqt"

SRCREV = "052919d39fbc4977372e1114001af6b210a89b6f"
PV = "0.9.0+git${SRCPV}"
SRC_URI += " \
    file://0001-set-installation-path-fixed-cmake-query-returns-sysr.patch \
"

FILES_${PN} += "${libdir}/${QT_DIR_NAME}/platformthemes"
FILES_${PN}-dbg += "${libdir}/${QT_DIR_NAME}/platformthemes/.debug"

