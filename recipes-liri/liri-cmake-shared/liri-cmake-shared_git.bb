SUMMARY = "Shared functions and macros for projects using the CMake build system"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = " \
	file://LICENSE.BSD;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit liri

# Avoid depending on myself
DEPENDS = "cmake-native"

PV = "1.1.0+git${SRCPV}"
SRCREV = "7b733575df377452cb8ed6c8291d6678cd0adb41"
S = "${WORKDIR}/git"

FILES:${PN}-dev += "${datadir}/LiriCMakeShared"
