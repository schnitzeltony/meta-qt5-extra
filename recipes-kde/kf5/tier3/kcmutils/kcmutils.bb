SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c1afcc332098a7c0f104629d1f67e4ad"
SRC_URI[sha256sum] = "1e12b79c13651e6086f315249d1be8cbe84fb996411eb50db0194b7c2ca7a2ac"

FILES_${PN} += "${datadir}/kservicetypes5"
