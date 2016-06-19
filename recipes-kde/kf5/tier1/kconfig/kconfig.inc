SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2b822e9e4549fd2deffc23468af461e1"
SRC_URI[sha256sum] = "629aa6ff4100c6af897420223f7afff718a80c3c357270e4a6aef87644f85ef1"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
    file://0002-do-not-export-location-for-kconf_update.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
