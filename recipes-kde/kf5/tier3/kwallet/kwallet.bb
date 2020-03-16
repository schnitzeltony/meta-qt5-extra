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
SRC_URI[md5sum] = "e0d5606183244471b7271dd31596daec"
SRC_URI[sha256sum] = "7524eeffdde3166df182f0dbf0f3f461905547bfd7a06387c7c503cd1ab75ecf"
SRC_URI += "file://0001-KF5WalletConfig.cmake.in-point-runtime-bindir-not-bu.patch"

FILES_${PN} += "${datadir}"
