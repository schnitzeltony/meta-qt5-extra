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
SRC_URI[md5sum] = "6839d8333aa4614dcb9cd9b67954cf1b"
SRC_URI[sha256sum] = "c81c2794610add13fd8019031fb40b0d002085d40ba358f6406c54f79581c149"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
