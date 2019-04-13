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
SRC_URI[md5sum] = "96323e110c0a2f04414c6cedf6603ea0"
SRC_URI[sha256sum] = "ad089026f4d5b10d567d0fd56f8b63749acd214fb8029d43187ba42afaf36975"

FILES_${PN} += "${datadir}"
