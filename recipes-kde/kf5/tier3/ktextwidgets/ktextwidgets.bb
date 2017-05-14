SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7cf308f1e3738ebed99c2ad08245ed6e"
SRC_URI[sha256sum] = "fc15f146da7f7fb1b758cb8213e62d609e53ad881493b05fe17c8d33161931c3"

FILES_${PN} += "${datadir}/kservicetypes5"
