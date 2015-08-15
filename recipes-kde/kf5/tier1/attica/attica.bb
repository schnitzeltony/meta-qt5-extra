SUMMARY = "Open Collaboration Services API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=be254b9345b1c2ff33e1a6a96768f2fb \
"

inherit kde-kf5 cmake-lib

SRC_URI[md5sum] = "e1c3a9de659aa78922ef170cea1f0fdd"
SRC_URI[sha256sum] = "106532a667a63d8b9aa39d8f857d5156f4e939d4f927c0809cf478b41472b83b"

PV = "${KF5_VERSION}"

CMAKE_ALIGN_SYSROOT[1] = "KF5Attica, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Attica, -S${includedir}, -S${STAGING_INCDIR}"

