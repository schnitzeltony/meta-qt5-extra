SUMMARY = "Open Collaboration Services API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=be254b9345b1c2ff33e1a6a96768f2fb \
"

inherit kde-kf5 cmake-lib

SRC_URI[md5sum] = "ef9d4203da44dd39736285db19b9b528"
SRC_URI[sha256sum] = "ebc51ef26ecb30e94fea243e18e5a4f785188b00033e6081a9eb7c743a00d185"

PV = "${KF5_VERSION}"

CMAKE_HIDE_ERROR[1] = "KF5Attica, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Attica, -S${includedir}, -S${STAGING_INCDIR}"

