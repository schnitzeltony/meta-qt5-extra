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
SRC_URI[md5sum] = "aa132506fd6e0eb8652f5e4129569a28"
SRC_URI[sha256sum] = "a3f802fa0f3d2b675ced7aee0ff56a684b435ddc43517d91decbbeea967a6018"

RDEPENDS_${PN} += "perl"
