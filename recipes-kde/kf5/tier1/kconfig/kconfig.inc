SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_lib

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "6046bbb8da5f3261aac7f868bfa8a8ce1015a3a8257fe0b2d37dce9e2bc3952e"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += "file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# native executables
CMAKE_ALIGN_SYSROOT[1] = "KF5Config, -s${_IMPORT_PREFIX}/libexec/kf5, -s${KDE_PATH_EXTERNAL_HOST_LIBEXECS}/kf5"
