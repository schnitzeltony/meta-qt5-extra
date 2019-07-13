SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7f80691fc6b32e04f3ea13be77edb5af"
SRC_URI[sha256sum] = "541acceead9ca516e3562109e7e94351ce378c234bea968c8dfde78f00559233"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# native executables
CMAKE_ALIGN_SYSROOT[1] = "KF5Config, -s${_IMPORT_PREFIX}/libexec/kf5, -s${KDE_PATH_EXTERNAL_HOST_LIBEXECS}/kf5"
