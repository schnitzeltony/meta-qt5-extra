SUMMARY = "LXQt Qt platform integration plugin"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += "liblxqt libdbusmenu-qt5 libfm-qt"

SRCREV = "9b52bfa8373ac320bde62ad949f01618aab668e4"
PV = "1.2.0"
SRC_URI += "file://0001-set-installation-path-fixed-cmake-query-returns-sysr.patch"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/platformthemes"
