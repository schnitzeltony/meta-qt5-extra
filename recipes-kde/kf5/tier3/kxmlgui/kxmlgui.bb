SUMMARY = "User configurable main windows"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    kitemviews \
    kconfig \
    kconfig-native \
    kglobalaccel \
    kconfigwidgets \
    ki18n \
    kiconthemes \
    ktextwidgets \
    kwidgetsaddons \
    kwindowsystem \
    attica \
    kcoreaddons-native \
    kauth-native \
    sonnet-native \
    gettext-native \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "899f9dca54c336c0034fa0aee2b5bf8f"
SRC_URI[sha256sum] = "ab08ed118f6806154fe10414d81dace413ecf80df3a561811f41879b48b7179f"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
