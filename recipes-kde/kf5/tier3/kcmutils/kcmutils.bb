SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "88f259c3bc692a2d94bde5618d8a7166"
SRC_URI[sha256sum] = "3c4915f8686242ac7c39b515c44ce56074c953fa5cf207e3fc6cd6f25a25a17e"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5KCMUtils, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5KCMUtils, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"
