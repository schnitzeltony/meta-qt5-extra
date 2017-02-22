SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "eccc7474f7442b656d26211050f3b2c3"
SRC_URI[sha256sum] = "697e6c562fb05ede13b996f49d35584b96a9517473170fa1cb5c776d4a81cf02"

FILES_${PN} += "${datadir}/kservicetypes5"
