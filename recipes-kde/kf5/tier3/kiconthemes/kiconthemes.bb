SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b39d9ceefb394842e5a2b762312a077a"
SRC_URI[sha256sum] = "33fb5caf28ee763edeb3def66386a27f6a7b2bac6a6a0f0728dd4b222d11ebfe"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
