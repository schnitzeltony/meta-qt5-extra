SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "520741ddd15e3d20666fd6dfcb99e9cb"
SRC_URI[sha256sum] = "15411f5efb0dc89426b63b9e059c725a15731ad7472fcacac9107ee9b3c4bd3e"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5UnitConversion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5UnitConversion, -S${includedir}, -S${STAGING_INCDIR}"
