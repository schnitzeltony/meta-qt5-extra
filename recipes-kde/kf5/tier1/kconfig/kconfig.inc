SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "79953233cd7d507f4f8394bf62e23078"
SRC_URI[sha256sum] = "b536a75a82fd00915204bbefb5f33dce1ada0a600cc47e947a13408fa883655a"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
    file://0002-do-not-export-location-for-kconf_update.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
