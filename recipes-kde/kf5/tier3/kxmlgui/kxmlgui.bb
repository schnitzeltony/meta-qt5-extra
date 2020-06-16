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
SRC_URI[md5sum] = "36183c3d85f6b92e4842273186f8e254"
SRC_URI[sha256sum] = "2e4b2563daeedf35a54d38002c05d7c39017a36c0b8a19c236ea87324eebf7cc"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
