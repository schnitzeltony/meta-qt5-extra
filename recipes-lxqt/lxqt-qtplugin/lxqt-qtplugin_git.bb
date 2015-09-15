SUMMARY = "LXQt Qt platform integration plugin"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "liblxqt"

SRCREV = "6584ff0df727f8d5017a66034b849f427d79bbc4"
PV = "0.9.0+git${SRCPV}"
SRC_URI += " \
    file://0001-set-installation-path-fixed-cmake-query-returns-sysr.patch \
"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/platformthemes"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/platformthemes/.debug"

