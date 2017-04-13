SUMMARY = "Desktop menu files for LXDE"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit autotools gettext

DEPENDS = "glib-2.0-native intltool-native"

SRC_URI = "git://github.com/lxde/${BPN}.git;protocol=git;branch=master"
S = "${WORKDIR}/git"

SRCREV = "3b14415ff9862e6b79577fd4b9a097965001b270"
PV = "0.1.5"

FILES_${PN} += "${datadir}/desktop-directories"
