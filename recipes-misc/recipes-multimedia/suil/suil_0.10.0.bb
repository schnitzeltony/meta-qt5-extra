SUMMARY = "Suil is a lightweight C library for loading and wrapping LV2 plugin UIs"
HOMEPAGE = "https://drobilla.net/software/suil"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=83836dc85960985c534b2a881cca21c0"

inherit waf distro_features_check pkgconfig

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS = "gtk+ gtk+3 qtbase lv2"

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "ba2f6bf631d8f3686772c2b5c9467628"
SRC_URI[sha256sum] = "9895c531f80c7e89a2b4b47de589d73b70bf48db0b0cfe56e5d54237ea4b8848"

FILES_${PN} += "${libdir}/suil-0"
