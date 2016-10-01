SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "acff06004aab9842db16237bc1627ee8"
SRC_URI[sha256sum] = "2dbfa24da7a7b3d8d06b0e9c3b9ad6471b5846499526ef37fad9b6088a5bd5df"

FILES_${PN} += "${datadir}/kservicetypes5"
