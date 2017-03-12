SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "080458511306645a49140fb8283b17cd"
SRC_URI[sha256sum] = "f9cc5f8829acd49ccd7543a5e8ee292ec42fad97ae31b03bd37f3a482c694ee8"

FILES_${PN} += "${datadir}/kservicetypes5"
