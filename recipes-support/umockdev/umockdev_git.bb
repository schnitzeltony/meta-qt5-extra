SUMMARY = "Mock hardware devices for creating unit tests and bug reporting"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/martinpitt/umockdev.git"
SRCREV = "4a580e2128b466f944db30ad82e737bde906471b"
PV = "0.15.4"
S = "${WORKDIR}/git"

inherit meson vala gobject-introspection features_check

# gobject-introspection is mandatory and cannot be configured
REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"
UNKNOWN_CONFIGURE_WHITELIST_append = " introspection"

DEPENDS += "glib-2.0 udev libgudev"
