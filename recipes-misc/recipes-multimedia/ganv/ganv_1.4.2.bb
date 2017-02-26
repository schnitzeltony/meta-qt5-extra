SUMMARY = "Ganv is a Gtk widget for interactive graph-like environments"
DESCRIPTION = "Ganv is a Gtk widget for interactive graph-like environments, such as modular synthesizers or finite state machines"
HOMEPAGE = "http://drobilla.net/software/ganv"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit waf

DEPENDS += " \
    gtk+ \
    gtkmm \
"

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "30c2c36d0c64d0a3b73e0bc7c564861c"
SRC_URI[sha256sum] = "145028ade1567f258de6ad58ad0f7941646208d261028a9b74eb61126e2dfa3c"
