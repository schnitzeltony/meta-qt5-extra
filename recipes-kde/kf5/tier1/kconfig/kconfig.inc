SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8589cb01dc2287399f8eb63966f79a84"
SRC_URI[sha256sum] = "f065f8fc2368bd529c0ebb0cec5b95857a1fa2b78fd2e363df61e1df77f96d57"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
	file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
