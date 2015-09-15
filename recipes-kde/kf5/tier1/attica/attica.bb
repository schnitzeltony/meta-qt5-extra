SUMMARY = "Open Collaboration Services API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=be254b9345b1c2ff33e1a6a96768f2fb \
"

inherit kde-kf5 cmake-lib

SRC_URI[md5sum] = "206256ed0dda3161d73a61d29835b04b"
SRC_URI[sha256sum] = "5eba50b9f0d28163b8a4fbdc909b1b88ad72de60df6f5e850c51849082b3bf58"

PV = "${KF5_VERSION}"

CMAKE_ALIGN_SYSROOT[1] = "KF5Attica, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Attica, -S${includedir}, -S${STAGING_INCDIR}"

