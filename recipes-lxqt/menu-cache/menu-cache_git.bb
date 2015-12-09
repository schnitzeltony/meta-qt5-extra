SUMMARY = "Library used to read freedesktop.org menus"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit autotools pkgconfig gtk-doc

DEPENDS = "glib-2.0 libfm-extra"

SRC_URI = "git://github.com/lxde/${BPN}.git"
S = "${WORKDIR}/git"
SRCREV = "4f60184fd82b5b54531367e480a14785459b8600"
PV = "1.0.1"

do_configure_append() {
    # fix binary installation path to what others do
    sed -i 's|pkglibexecdir =.*|pkglibexecdir = $(libexecdir)|g' `find ${B} -name Makefile`
}
