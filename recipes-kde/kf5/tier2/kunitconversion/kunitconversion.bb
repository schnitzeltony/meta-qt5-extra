SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "80bbcfc184a8fa6a1664be4719966974"
SRC_URI[sha256sum] = "e2b803059875c8bfe71e6b5e097ceba50b9ea0fecb5175f311dd604df8ca526e"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5UnitConversion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5UnitConversion, -S${includedir}, -S${STAGING_INCDIR}"
