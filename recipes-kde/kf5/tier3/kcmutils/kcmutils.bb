SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "66cc0a60a318647531371ce8b8eff0e2"
SRC_URI[sha256sum] = "4973b7ac9bde35e2ce75b2fefc81ad9ab697a14a26c8bc0a3d673de4b814a38b"

FILES_${PN} += "${datadir}/kservicetypes5"
