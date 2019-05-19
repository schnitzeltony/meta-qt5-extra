SUMMARY = "Secure and unified container for user passwords"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    libgcrypt \
    gpgme \
    kconfig \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    kdbusaddons \
    kiconthemes \
    ki18n \
    knotifications \
    kservice \
    kwidgetsaddons \
    kwindowsystem \
    gettext-native \
    kdoctools-native \
    kauth-native \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b27baeea7c21967609a4507cf616d47a"
SRC_URI[sha256sum] = "5203765ba2061727d0280bf7e9cbbade462ba2c5e7389f4f8d78afc522ba2030"

FILES_${PN} += "${datadir}"
