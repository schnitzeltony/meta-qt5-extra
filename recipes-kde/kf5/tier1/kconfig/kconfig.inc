SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "79352591234d65d2b4c4ceef6a159f81"
SRC_URI[sha256sum] = "b31e3a8595fa8dc14aa0b1828633c712205097a6e3d14650ae813d4d7833d654"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-kconfiggui-do-only-compile-in-case-sessions-are-aval.patch \
    file://0002-do-not-export-location-for-kconf_update.patch \
    file://0003-make-autotests-optional-by-BUILD_TESTING.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# native executables
CMAKE_ALIGN_SYSROOT[1] = "KF5Config, -s${_IMPORT_PREFIX}/libexec/kf5, -s${KDE_PATH_EXTERNAL_HOST_LIBEXECS}/kf5"
