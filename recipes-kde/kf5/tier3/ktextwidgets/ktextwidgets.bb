SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons \
            kwindowsystem sonnet kconfig-native kcoreaddons-native kauth-native \
            gettext-native sonnet-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4d7fd58963b27fb64c80365e9e366caa"
SRC_URI[sha256sum] = "b74036eea1ec19a22aa0e76cd1a8338f55e5c32a30dc47d602783c6bc5ba54bf"

FILES_${PN} += "${datadir}/kservicetypes5"
