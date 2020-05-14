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
SRC_URI[md5sum] = "33a1dc6ab1be41fac3e81f6cb472a069"
SRC_URI[sha256sum] = "39054e5fcb3f6633ea8496fc4c8b47f5543ecadc9739be7564fdec1c19f746df"
SRC_URI += "file://0001-KF5WalletConfig.cmake.in-point-runtime-bindir-not-bu.patch"

FILES_${PN} += "${datadir}"
