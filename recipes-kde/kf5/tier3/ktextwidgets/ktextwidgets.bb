SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "656cdbdf3d8ae056574b3204e80716cf"
SRC_URI[sha256sum] = "5e66c9cc636f851d3f9aeb412e056dbe672e4fd572f1aae5e37fdd52ccc83227"

FILES_${PN} += "${datadir}/kservicetypes5"
