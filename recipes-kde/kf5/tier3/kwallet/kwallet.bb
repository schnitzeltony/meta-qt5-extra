SUMMARY = "Secure and unified container for user passwords"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    libgcrypt \
    gpgme \
    gpgme-native \
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

# TBD: add KF5Gpgmepp with PACKAGECONFIG??

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6f7fe0204d75eb6ecb6c32f2ec02fbca"
SRC_URI[sha256sum] = "5f83a5ca245773abfe5b31c536996ca1aee312d512181d133edcd890874f9fee"

FILES_${PN} += "${datadir}"
