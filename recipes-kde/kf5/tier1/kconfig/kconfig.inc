SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "826d84426eb7cf9f2bccd49aca694f96"
SRC_URI[sha256sum] = "4c15c64125a2f22bce1a2b3e14613a24e6585e973f35d5d8d92f723d0370adb7"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
    file://0002-do-not-export-location-for-kconf_update.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
