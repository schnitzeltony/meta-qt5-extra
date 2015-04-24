SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cb210f051face97978d7aa64955ae8f7"
SRC_URI[sha256sum] = "a14951f08e13c67b00a5ee4f4e00d998875630d9c40f27af53173bdb75a618d6"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
	file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
