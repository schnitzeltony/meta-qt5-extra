SUMMARY = "Ganv is a Gtk widget for interactive graph-like environments"
DESCRIPTION = "Ganv is a Gtk widget for interactive graph-like environments, such as modular synthesizers or finite state machines"
HOMEPAGE = "http://drobilla.net/software/ganv"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit waf

DEPENDS += " \
    glib-2.0-native \
    gtk+ \
    gtkmm \
"

SRC_URI = " \
    git://git.drobilla.net/ganv.git;protocol=http \
    file://0001-Do-not-inject-usr-local-include-to-include-paths.patch \
"
SRCREV = "ccc9b971ab206fa3dc32a432a3e76db976192f58"
S = "${WORKDIR}/git"
PV = "1.4.2+git${SRCPV}"
