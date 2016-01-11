SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "061b6eedc15239368e5bd60645b99a50"
SRC_URI[sha256sum] = "36a4c887080bff674bccd302985ff9a401d8e1a8a0649616ff686f4d1ddceee8"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
    file://0002-do-not-export-location-for-kconf_update.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
