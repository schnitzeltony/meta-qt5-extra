SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "51788f84902358d7840c1d4ed111a80d"
SRC_URI[sha256sum] = "1da114407c2f2953c8e6bc3cb0560824f064b71293fb283643d74c3796e98b2e"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
    file://0002-do-not-export-location-for-kconf_update.patch \
    file://0003-make-autotests-optional-by-BUILD_TESTING.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
