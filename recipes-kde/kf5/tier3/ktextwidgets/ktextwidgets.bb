SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a52513dc18e2f52ca4fa6188b48df3df"
SRC_URI[sha256sum] = "822cd35ee7b4211328de94754217c72b2b43a08ed5e890d50d77e1363fb54e61"

FILES_${PN} += "${datadir}/kservicetypes5"
