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
SRC_URI[md5sum] = "1e4617a802eb84ce259d2cffbe00054e"
SRC_URI[sha256sum] = "c6d6d5b05af21ebdca03f110a2563b0bad0f069078cb0d94a629624f29450657"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
