SUMMARY = "Open Collaboration Services API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=be254b9345b1c2ff33e1a6a96768f2fb \
"

inherit kde-kf5 cmake-lib

SRC_URI[md5sum] = "935921bcc04f7e4af10be8e57b7ac899"
SRC_URI[sha256sum] = "94c928b84a82c44c1331a1b4d585e894524c4a023f90e1906eaf5441d955ad3d"

PV = "${KF5_VERSION}"

CMAKE_ALIGN_SYSROOT[1] = "KF5Attica, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Attica, -S${includedir}, -S${STAGING_INCDIR}"

