SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f7169075c22857b40d256bd6323d1a10"
SRC_URI[sha256sum] = "764bc8af55482cf1c88817c85c12a0fdb3fde5726ab0386cbb1b2f5df2256f20"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
    file://0002-do-not-export-location-for-kconf_update.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
