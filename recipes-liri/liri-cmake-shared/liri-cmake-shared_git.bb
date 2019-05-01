SUMMARY = "Shared functions and macros for projects using the CMake build system"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = " \
	file://LICENSE.BSD;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit liri

# Avoid depending on myself
DEPENDS = "cmake-native"

PV = "1.0.0+git${SRCPV}"
SRCREV = "bf4ba186795bed898083c6e1e31bba49af936250"
S = "${WORKDIR}/git"

FILES_${PN}-dev += "${datadir}/LiriCMakeShared"
