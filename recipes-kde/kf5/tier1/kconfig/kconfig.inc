SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1894bf1bd4c22505978bf50b7b276fd3"
SRC_URI[sha256sum] = "b79d14ddee564f8876cd75e67d95e4266ff253cce55073a12e292d04688052dd"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
    file://0002-do-not-export-location-for-kconf_update.patch \
    file://0003-make-autotests-optional-by-BUILD_TESTING.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
