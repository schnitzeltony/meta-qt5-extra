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
SRC_URI[md5sum] = "8cc14092879706a9fc04fb2aca6da04c"
SRC_URI[sha256sum] = "dcc4595ceeecd3f59236ed303f2a0d61915c88eb36ad040a0562b60fb10cb9a1"

FILES_${PN} += " \
     ${OE_QMAKE_PATH_PLUGINS}/designer \
     ${datadir}/kservicetypes5 \
"

