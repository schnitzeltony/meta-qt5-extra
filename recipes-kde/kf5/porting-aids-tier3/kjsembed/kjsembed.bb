SUMMARY = "Embedded JS"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids cmake-lib

DEPENDS += "qtsvg qttools kjs ki18n kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "370da9915046901f48e9e3e5cf69d202"
SRC_URI[sha256sum] = "70c3e943031e478ad09927bd7d8ebf95fbaf8a400d38d55131c20bc340bcaf3a"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5JsEmbed, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5JsEmbed, -S${includedir}, -S${STAGING_INCDIR}"

# HACK for kjscmd5: to avoid more native qt5 extensions we simply link to icemaker
# created by kjs-native which is in the dependency chain by kjs. kjs-native has
# only few dependencies and nothing needs kjscmd5 to build. The only reason to
# do this hack is to make cmake checks happy.
CMAKE_ALIGN_SYSROOT[3] = "KF5JsEmbed, -S${bindir}/kjscmd5, -S${STAGING_BINDIR_NATIVE}/icemaker"
