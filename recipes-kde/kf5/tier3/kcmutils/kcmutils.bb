SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "44d7f2b251cc4725d6ca52007cdd291d"
SRC_URI[sha256sum] = "1a73e8b897e845be383e0fc12f66f15164427d8e85c8aad294672fe89bff19ac"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5KCMUtils, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5KCMUtils, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"
