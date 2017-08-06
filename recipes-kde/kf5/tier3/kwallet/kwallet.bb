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
SRC_URI[md5sum] = "ab5492c0b6690fac3ad3aa1bbca5341e"
SRC_URI[sha256sum] = "8782caeb8d75da67a84c8eddf1d28af19fb01ffc0bbf7a35c0240e22519ccabb"

SRC_URI += "file://0001-add-NO_CMAKE_FIND_ROOT_PATH-in-find-to-org.kde.KWall.patch"

FILES_${PN} += "${datadir}"
