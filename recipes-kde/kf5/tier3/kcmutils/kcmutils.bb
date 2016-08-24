SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "139af7a01a29e7dbd81f25adae1df9b2"
SRC_URI[sha256sum] = "f58a89543d52c82b0a9ae527b2a73141ef9f970d7cf6393a47f0b42f61696931"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5KCMUtils, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5KCMUtils, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"
