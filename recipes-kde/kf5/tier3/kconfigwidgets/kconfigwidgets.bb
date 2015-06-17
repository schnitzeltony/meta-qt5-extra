SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kauth kcodecs kdoctools kguiaddons kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "91e25767cadb56b3894ebfff045f7a21"
SRC_URI[sha256sum] = "8dfadb445da5622f6e85a43db2b7cd2515b9d2bb1b0ce6f9c4cf277f440270ec"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5ConfigWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ConfigWidgets, -S${includedir}, -S${STAGING_INCDIR}"

RDEPENDS_${PN} += "perl"
