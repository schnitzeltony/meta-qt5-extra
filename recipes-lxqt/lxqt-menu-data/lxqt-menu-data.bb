SUMMARY = "Desktop menu files for LXQt"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "glib-2.0-native intltool-native"

SRC_URI = "git://github.com/lxqt/${BPN}.git;branch=master;protocol=https"
S = "${WORKDIR}/git"

SRCREV = "204b1d0acc4cbe59149e4f6eb1e2424d0472cdbc"
PV = "1.4.0"

FILES:${PN} += "${datadir}/desktop-directories"
