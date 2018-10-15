SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e1c816d21191a8bddf2fab5ffebb9f6f"
SRC_URI[sha256sum] = "89813a2a3ecb2ddd061db6a040dcf4677c10e41cbcce49cad5c926a8f1ce5c8f"
