SUMMARY = "Widgets for configuration dialog"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kauth kconfig kcodecs kguiaddons kwidgetsaddons kdoctools \
            kcoreaddons-native kauth-native kconfig-native kdoctools-native \
            gettext-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "06a55b60840ee009716f23badf3df8c7"
SRC_URI[sha256sum] = "6fcf93cf2a5c7f81a272f685d329e711a21d2ff314fe7737a52592a138c37473"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"

RDEPENDS_${PN} += "perl"
