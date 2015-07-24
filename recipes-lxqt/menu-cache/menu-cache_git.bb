SUMMARY = "Library used to read freedesktop.org menus"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit autotools pkgconfig gtk-doc

DEPENDS = "glib-2.0 libfm-extra"

SRC_URI = "git://github.com/lxde/${BPN}.git"
S = "${WORKDIR}/git"
SRCREV = "e9ece4a1f8b82e7c5d7eba67a62f5d7e71c6e3ea"
PV = "1.0.0+git${SRCPV}"
