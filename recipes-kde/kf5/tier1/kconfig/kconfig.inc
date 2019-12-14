SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "32386a853fd86fd6887cf17c9872e4d7"
SRC_URI[sha256sum] = "8dfa064effdf559e1179e9d7e5ec12ff9d79fcfef1859bd1793557261e94a6ed"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# native executables
CMAKE_ALIGN_SYSROOT[1] = "KF5Config, -s${_IMPORT_PREFIX}/libexec/kf5, -s${KDE_PATH_EXTERNAL_HOST_LIBEXECS}/kf5"
