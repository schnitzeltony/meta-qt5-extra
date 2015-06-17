SUMMARY = "Embedded JS"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids cmake-lib

DEPENDS += "qtsvg qttools kjs ki18n kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "dee5aff4f8b0eaf30a0fc5f572086fe7"
SRC_URI[sha256sum] = "97fff81d5f262565b067b4967405e332892df9aeed709204d9b628ed52130a6a"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5JsEmbed, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5JsEmbed, -S${includedir}, -S${STAGING_INCDIR}"

# HACK for kjscmd5: to avoid more native qt5 extensions we simply link to icemaker
# created by kjs-native which is in the dependency chain by kjs. kjs-native has
# only few dependencies and nothing needs kjscmd5 to build. The only reason to
# do this hack is to make cmake checks happy.
CMAKE_ALIGN_SYSROOT[3] = "KF5JsEmbed, -S${bindir}/kjscmd5, -S${STAGING_BINDIR_NATIVE}/icemaker"
