SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "aeedbcb2424156f714844d084e403af6"
SRC_URI[sha256sum] = "14a3496c341429313eb02e8006dff527ad0766939f822d55c8531e9392800a50"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
	file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
