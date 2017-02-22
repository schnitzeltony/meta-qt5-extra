SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a3240501f842655be3b354d98da95939"
SRC_URI[sha256sum] = "fe6a4fc7437bcb446d3950636b21e5db3e8e93c9502e2082332ee04596201b58"

FILES_${PN} += "${datadir}/kservicetypes5"
