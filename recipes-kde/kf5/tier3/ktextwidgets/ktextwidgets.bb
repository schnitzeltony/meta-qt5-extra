SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0263527d48768ed6d242f741f00eddea"
SRC_URI[sha256sum] = "b7f39015f24afce7fb17c795bb4316f3d240315fc6d24d4b68383ba92358923f"

FILES_${PN} += "${datadir}/kservicetypes5"
