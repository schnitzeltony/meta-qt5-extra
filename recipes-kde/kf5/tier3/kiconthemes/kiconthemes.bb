SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews gettext-native \
            kcoreaddons-native kauth-native kconfig-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fcabfaf2a08be0bee4317dd7b48a46ac"
SRC_URI[sha256sum] = "3c1be304537d4c7eedd097463c977b3d0e845c575567ffc53faff7b3e874ebe5"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
