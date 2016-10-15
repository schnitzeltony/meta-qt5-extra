SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ae53fa18d7dd319afd7f65355581bfc3"
SRC_URI[sha256sum] = "ddc141af1d58b44e906d5f08a0712d84b96a254518227c4114fa2b331068cb12"

FILES_${PN} += "${datadir}/kservicetypes5"
