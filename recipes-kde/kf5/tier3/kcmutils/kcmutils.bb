SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8fba178eb8b88bf19d5079904faed57e"
SRC_URI[sha256sum] = "cd263f94af1bf6301c0482a526b25c41951da8bdd58b677b7e73824bbbac0c58"

FILES_${PN} += "${datadir}/kservicetypes5"
