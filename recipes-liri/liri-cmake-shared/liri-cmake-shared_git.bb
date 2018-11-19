SUMMARY = "Shared functions and macros for projects using the CMake build system"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = " \
	file://LICENSE.BSD;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit liri

PV = "1.0.0+git${SRCPV}"

SRCREV = "7d2b9b92528c2a3e098d27bfa29faba453a9306c"
S = "${WORKDIR}/git"

FILES_${PN}-dev += "${datadir}/LiriCMakeShared"
