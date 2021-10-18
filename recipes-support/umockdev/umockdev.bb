SUMMARY = "Mock hardware devices for creating unit tests and bug reporting"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/martinpitt/umockdev.git"
SRCREV = "8d53ab042b30dfb3f3be7cd9803aa8a545ef1f53"
PV = "0.15.5"
S = "${WORKDIR}/git"

inherit meson vala gobject-introspection features_check pkgconfig

# gobject-introspection is mandatory and cannot be configured
REQUIRED_DISTRO_FEATURES = "gobject-introspection-data"
UNKNOWN_CONFIGURE_WHITELIST:append = " introspection"

DEPENDS += "glib-2.0 udev libgudev"
