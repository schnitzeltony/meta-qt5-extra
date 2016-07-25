SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "69aaa1205564792c18ddfdaac7d60d61"
SRC_URI[sha256sum] = "b5341091e70ede689dcae61f7315a269e2eec40ba98ab607eb5785011e286605"

CMAKE_ALIGN_SYSROOT[1] = "KF5DNSSD, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5DNSSD, -S${includedir}, -S${STAGING_INCDIR}"

