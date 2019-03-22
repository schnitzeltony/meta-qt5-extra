SUMMARY = "Mock hardware devices for creating unit tests and bug reporting"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/martinpitt/umockdev.git"
SRCREV = "a9a34ac0e71f6eae4432261ad3fd647dbee070cb"
PV = "0.12.1"
S = "${WORKDIR}/git"

inherit autotools pkgconfig vala gobject-introspection gtk-doc

DEPENDS += "glib-2.0 udev libgudev"

EXTRA_OECONF += "--disable-gtk-doc"
# Although we disable doc we need ${S}/docs/gtk-doc.make
GTKDOC_DOCDIR = "${S}/docs"

do_configure_prepend() {
    mkdir -p ${S}/m4
}
