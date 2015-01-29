SUMMARY = "Embedded JS"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

SRCREV = "72645d0ca8942b2550377567fe861183de8ab038"

DEPENDS += "qtsvg qttools kjs ki18n kdoctools"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5JsEmbed, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5JsEmbed, -S${includedir}, -S${STAGING_INCDIR}"

# HACK for kjscmd5: to avoid more native qt5 extensions we simply link to icemaker
# created by kjs-native which is in the dependency chain by kjs. kjs-native has
# only few dependencies and nothing needs kjscmd5 to build. The only reason to
# do this hack is to make cmake checks happy.
CMAKE_HIDE_ERROR[3] = "KF5JsEmbed, -S${bindir}/kjscmd5, -S${STAGING_BINDIR_NATIVE}/icemaker"
