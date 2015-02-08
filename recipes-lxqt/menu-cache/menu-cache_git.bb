SUMMARY = "Library used to read freedesktop.org menus"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit autotools pkgconfig gtk-doc

DEPENDS = "glib-2.0 libfm-extra"

SRC_URI = "git://github.com/lxde/${BPN}.git;protocol=git;branch=master"
S = "${WORKDIR}/git"
SRCREV = "2097b14e2fbcf33f2fe0bb0e93829ccb1e04ae64"
PV = "1.0.0+git${SRCPV}"
