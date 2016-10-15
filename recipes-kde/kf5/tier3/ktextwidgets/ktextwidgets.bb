SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c32881a059bd4af1874262f682b0a2e5"
SRC_URI[sha256sum] = "a49eec9e15af85f1793cd1774a8b38b62e04d3ee0d645d70919d7a4e4cc7022b"

FILES_${PN} += "${datadir}/kservicetypes5"
