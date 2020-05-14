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
SRC_URI[md5sum] = "d00a98ef67a05c7848b755c95ccbc062"
SRC_URI[sha256sum] = "fc1057c291e44a2fe7c971f3e3695924acb0f648932bc8539ee418b538cd0998"

FILES_${PN} += " \
     ${OE_QMAKE_PATH_PLUGINS}/designer \
     ${datadir}/kservicetypes5 \
"

