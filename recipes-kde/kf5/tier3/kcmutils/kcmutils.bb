SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5cd7908f7bb316f6c41bf42dfaa33c76"
SRC_URI[sha256sum] = "4a99e11bfff6b77acc6b45b05a8557df2ce66c4593276f4649f8ac3f7d714372"

FILES_${PN} += "${datadir}/kservicetypes5"
