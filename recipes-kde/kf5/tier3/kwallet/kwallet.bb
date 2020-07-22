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
SRC_URI[md5sum] = "7844e7c37510251e6f997d78db983541"
SRC_URI[sha256sum] = "3a1624ae9bd8384ca981b38cdf026abb31a6708e5f12680cd71605316cdf4c9f"
SRC_URI += "file://0001-KF5WalletConfig.cmake.in-point-runtime-bindir-not-bu.patch"

FILES_${PN} += "${datadir}"
