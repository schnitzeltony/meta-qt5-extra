SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kauth kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "92e496e9e439d0a4518d2500fa6e51d5"
SRC_URI[sha256sum] = "fb3d04efebb0ac570defd92eff778cc78052ca8a33c2e5b88b415c02e2d9791c"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5ConfigWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5ConfigWidgets, -S${includedir}, -S${STAGING_INCDIR}"

RDEPENDS_${PN} += "perl"
