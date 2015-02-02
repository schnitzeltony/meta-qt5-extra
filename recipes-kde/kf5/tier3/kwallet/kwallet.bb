SUMMARY = "Secure and unified container for user passwords"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

DEPENDS += " \
	libgcrypt \
	gpgme-native gpgme \
	kconfig \
	kcoreaddons \
	kdbusaddons \
	kiconthemes \
	ki18n \
	knotifications \
	kservice \
	kwidgetsaddons \
	kwindowsystem \
"

# TBD: add KF5Gpgmepp with PACKAGECONFIG??

SRC_URI += "file://0001-add-NO_CMAKE_FIND_ROOT_PATH-in-find-to-org.kde.KWall.patch"
SRCREV = "5a605f8a6ec979aac537230e82bace01f499abb4"
S = "${WORKDIR}/git"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Wallet, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Wallet, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}"
