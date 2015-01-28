SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
	file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
"
SRCREV = "fef653b071c97cc22117a215cc858be963a479ed"
PV = "5.7.0"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
