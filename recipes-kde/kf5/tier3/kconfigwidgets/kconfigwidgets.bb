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
SRC_URI[md5sum] = "47f7c6f667b077e19a2154f9ca96a993"
SRC_URI[sha256sum] = "a54382442dedd4da340f291d81d1dd1a89289bcb42e8d82d34555e44611e3c6a"

RDEPENDS_${PN} += "perl"
