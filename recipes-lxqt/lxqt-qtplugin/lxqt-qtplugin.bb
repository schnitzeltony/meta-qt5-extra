SUMMARY = "LXQt Qt platform integration plugin"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += "liblxqt libdbusmenu-qt5 libfm-qt"

SRCREV = "f1fd8df7f2d96b1393d70998e55c57b6404c46f9"
PV = "0.17.0"
SRC_URI += "file://0001-set-installation-path-fixed-cmake-query-returns-sysr.patch"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/platformthemes"
