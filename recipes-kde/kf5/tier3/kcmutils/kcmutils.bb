SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui kdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0a20fe05077b7d23b016901af6fe160a"
SRC_URI[sha256sum] = "a9666c3c944703355465bfaf9ee7ed8599a099935a2a91eaca6e09c1f88129d7"

FILES_${PN} += "${datadir}/kservicetypes5"
