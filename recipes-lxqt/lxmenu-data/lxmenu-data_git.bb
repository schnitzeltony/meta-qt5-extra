SUMMARY = "Desktop menu files for LXDE"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit autotools gettext

DEPENDS = "glib-2.0 intltool-native"

SRC_URI = "git://github.com/lxde/${BPN}.git;protocol=git;branch=master"
S = "${WORKDIR}/git"

SRCREV = "4a2342616c5cc2a089256ebb64e763ff7cb0d5a6"
PV = "0.1.4"

FILES_${PN} += "${datadir}/desktop-directories"
