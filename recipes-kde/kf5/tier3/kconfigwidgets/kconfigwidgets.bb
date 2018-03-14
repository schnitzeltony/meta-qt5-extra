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
SRC_URI[md5sum] = "2409b6fc8dc8e9995cdaef33bab5be31"
SRC_URI[sha256sum] = "3f8be4b3d9ae39ed9de01e3ac062d6c4852d90d05785c45f30408113159a4795"

RDEPENDS_${PN} += "perl"
