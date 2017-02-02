SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a40df281c209833eb1487d6eca35d561"
SRC_URI[sha256sum] = "5c86dc3d5866d53d2e70bb5321ff74431886c825304db5997f617d6e5e94f8ba"

FILES_${PN} += "${datadir}/kservicetypes5"
