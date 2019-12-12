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
SRC_URI[md5sum] = "053848f2f12241de152c6b38623eb3c4"
SRC_URI[sha256sum] = "16ff5bb5724105c3d59404f292232c03c6003f6229b483509e395e1171ccabde"
SRC_URI += "file://0001-KF5WalletConfig.cmake.in-point-runtime-bindir-not-bu.patch"

FILES_${PN} += "${datadir}"
