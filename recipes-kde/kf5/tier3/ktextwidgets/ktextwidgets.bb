SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons kwindowsystem sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ada2d9d175b905cf73eec1522bb39376"
SRC_URI[sha256sum] = "47fcec17d6d1d7f9b55e776e8ae0abd55b16de78f74424e7ea5c842ca6623c86"

FILES_${PN} += "${datadir}/kservicetypes5"
