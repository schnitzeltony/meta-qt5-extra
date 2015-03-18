SUMMARY = "Secure and unified container for user passwords"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

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

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3c5803acbbe295726017b80d7b5d1d49"
SRC_URI[sha256sum] = "c8cb635a9f58c996679dffeec47be8b0a9ff9627c31ae411f6543183a0748dc3"

SRC_URI += "file://0001-add-NO_CMAKE_FIND_ROOT_PATH-in-find-to-org.kde.KWall.patch"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Wallet, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Wallet, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}"
