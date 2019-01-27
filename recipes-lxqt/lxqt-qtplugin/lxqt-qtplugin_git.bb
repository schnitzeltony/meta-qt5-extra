SUMMARY = "LXQt Qt platform integration plugin"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += "liblxqt libdbusmenu-qt5 libfm-qt"

SRCREV = "07e10038af7f6cc93e6bd7927e910c060bf2e357"
PV = "0.14.0"
SRC_URI += " \
    file://0001-set-installation-path-fixed-cmake-query-returns-sysr.patch \
"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/platformthemes"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/platformthemes/.debug"

