SUMMARY = "Desktop menu files for LXDE"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit autotools gettext

DEPENDS = "glib-2.0 intltool-native"

SRC_URI = "git://github.com/lxde/${BPN}.git;protocol=git;branch=master"
S = "${WORKDIR}/git"

SRCREV = "4f3a96e53b6414365f33e04901ee3c0db4c0d3ea"
PV = "0.1.4+git${SRCPV}"

FILES_${PN} += "${datadir}/desktop-directories"
