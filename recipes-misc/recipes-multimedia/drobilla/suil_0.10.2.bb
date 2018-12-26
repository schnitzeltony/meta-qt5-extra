SUMMARY = "Suil is a lightweight C library for loading and wrapping LV2 plugin UIs"
HOMEPAGE = "https://drobilla.net/software/suil"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=83836dc85960985c534b2a881cca21c0"

inherit waf distro_features_check pkgconfig

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS = "gtk+ gtk+3 qtbase lv2"

SRC_URI = " \
    http://download.drobilla.net/${BPN}-${PV}.tar.bz2 \
    file://0001-Do-not-try-to-build-macOS-cocoa.patch \
"
SRC_URI[md5sum] = "e92d656b5faf999226642cdbe595976d"
SRC_URI[sha256sum] = "9f445910627fb30f4c182b9ee00d1030324910d8a9ce7c9654c34465411da401"

FILES_${PN} += "${libdir}/suil-0"
