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
SRC_URI[md5sum] = "0a9f9185b73c61ff98d866b347cb84ab"
SRC_URI[sha256sum] = "a2d9c690f67d817939a4466e6b59c46ed0b0439e9df2f0a21850dddae19477d1"

RDEPENDS_${PN} += "perl"
