SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9867fe7fb968cec64265ce59067a8d7e"
SRC_URI[sha256sum] = "da973b27b731d563704992ced206eda75f148c59422743bbe84f82d5e7ad0d49"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5KCMUtils, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5KCMUtils, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/kservicetypes5"
