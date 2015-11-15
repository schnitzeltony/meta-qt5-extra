SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b8384961948af1ecb299991468c35eb2"
SRC_URI[sha256sum] = "4230e44395ec59e855fd4e70ebfd1d7a62fd1182c2a07d0cc4cee5234bc39620"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Completion, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Completion, -S${includedir}, -S${STAGING_INCDIR}"
