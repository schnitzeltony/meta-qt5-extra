SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ece57ac4adf9565712901102daaae962"
SRC_URI[sha256sum] = "02a761033f043ee43b2874b335a40fc4ac7b35a68b723ce29057b71bb2ad36f2"

FILES_${PN} += "${datadir}/kservicetypes5"
