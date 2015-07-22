SUMMARY = "Open Collaboration Services API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=be254b9345b1c2ff33e1a6a96768f2fb \
"

inherit kde-kf5 cmake-lib

SRC_URI[md5sum] = "f12d5f866690b0954dfaa963e971eb27"
SRC_URI[sha256sum] = "873d406c50a5abfed196a087281bdc7a6683e713ef255306fedce97f720e6114"

PV = "${KF5_VERSION}"

CMAKE_ALIGN_SYSROOT[1] = "KF5Attica, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Attica, -S${includedir}, -S${STAGING_INCDIR}"

