SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kauth kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRCREV = "1335e3e55ab7f68e59aae9bf5529eeabc9738d27"
S = "${WORKDIR}/git"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5ConfigWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5ConfigWidgets, -S${includedir}, -S${STAGING_INCDIR}"

RDEPENDS_${PN} += "perl"
