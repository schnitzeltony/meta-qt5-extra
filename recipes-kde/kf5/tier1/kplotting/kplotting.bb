SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "637609e197e3ed92ae352f86f14d0baf"
SRC_URI[sha256sum] = "f1ce8e4585239037b59adefc2603a57d9fc53ef2446d40bdc8c501ec61f3a708"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Plotting, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Plotting, -S${includedir}, -S${STAGING_INCDIR}"
