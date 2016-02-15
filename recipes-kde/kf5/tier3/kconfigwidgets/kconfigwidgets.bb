SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kauth kconfig kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ce0c538d90c1753fea03be8beacfc648"
SRC_URI[sha256sum] = "fb7a748eb1ceee2a33027581707d1942b1eae239526873367f924b06d9118dda"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ConfigWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ConfigWidgets, -S${includedir}, -S${STAGING_INCDIR}"

RDEPENDS_${PN} += "perl"
