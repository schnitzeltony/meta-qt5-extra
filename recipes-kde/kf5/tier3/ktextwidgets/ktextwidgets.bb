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
SRC_URI[md5sum] = "fa0e0f5e0715fbe9e35560fd8b4632e1"
SRC_URI[sha256sum] = "0a7fae03d8b59ec8a4f7c49a228536ea4121bd3d8f19fb1ff9831ada428509f4"

FILES_${PN} += " \
     ${OE_QMAKE_PATH_PLUGINS}/designer \
     ${datadir}/kservicetypes5 \
"

