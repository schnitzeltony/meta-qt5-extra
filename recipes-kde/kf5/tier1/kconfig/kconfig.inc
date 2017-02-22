SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f044848c2406fa1452b11780af2e1fea"
SRC_URI[sha256sum] = "b1431eadb49889ebfce9b912f207bdf405b0c96ef5a390fa6147b61f737132fd"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
    file://0002-do-not-export-location-for-kconf_update.patch \
    file://0003-make-autotests-optional-by-BUILD_TESTING.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
