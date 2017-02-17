SUMMARY = "Suil is a lightweight C library for loading and wrapping LV2 plugin UIs"
HOMEPAGE = "https://drobilla.net/software/suil"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=83836dc85960985c534b2a881cca21c0"

inherit waf distro_features_check pkgconfig

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS = "gtk+ qtbase lv2"

SRC_URI = "http://www.rncbc.org/archive/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "50598cc44f419f60805862272abe881c"
SRC_URI[sha256sum] = "6ef2247eaeaf3b5d7fc7a2728bcbca797d40586111c954bbc9d80805211d51ce"

FILES_${PN} += "${libdir}/suil-0"
