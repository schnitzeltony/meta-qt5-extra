SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6bad585122df5ee6e421ff192c007444"
SRC_URI[sha256sum] = "df584c8a4688b8716d77bdbb77a354ca8f609ea235b4829402e927b4c000d36b"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5KCMUtils, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5KCMUtils, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"
