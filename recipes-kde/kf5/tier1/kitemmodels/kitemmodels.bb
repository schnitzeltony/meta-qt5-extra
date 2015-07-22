SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ce9f3e3adefc17848c51f06e96572947"
SRC_URI[sha256sum] = "bab2321ffcb6a86358a7766f17f76501de8e5f5b72599fbc8a60fead5359ba72"

CMAKE_ALIGN_SYSROOT[1] = "KF5ItemModels, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ItemModels, -S${includedir}, -S${STAGING_INCDIR}"

