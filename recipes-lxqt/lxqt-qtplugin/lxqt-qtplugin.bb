SUMMARY = "LXQt Qt platform integration plugin"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += "liblxqt libdbusmenu-qt5 libfm-qt"

SRCREV = "8b65fb962dae7f9bb865092aafd9775d5669b93d"
PV = "1.1.0"
SRC_URI += "file://0001-set-installation-path-fixed-cmake-query-returns-sysr.patch"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/platformthemes"
