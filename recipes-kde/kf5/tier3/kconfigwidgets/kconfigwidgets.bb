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
SRC_URI[md5sum] = "e71837861bb02791109ce75baef877db"
SRC_URI[sha256sum] = "730834528307c65691d67c901f1c186b49d74ee986ef75e171e867e8751bf10a"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"

RDEPENDS_${PN} += "perl"
