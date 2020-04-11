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
SRC_URI[md5sum] = "394717dc0b0f0b8e35d0e76fdfa0221b"
SRC_URI[sha256sum] = "182661253bf2ed940ab52edfeb2d8cadf1abbde76cade2ba50ef490311002ec9"

FILES_${PN} += " \
     ${OE_QMAKE_PATH_PLUGINS}/designer \
     ${datadir}/kservicetypes5 \
"

