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
SRC_URI[md5sum] = "15bd67e33adc2fce5fdabb580b4a408a"
SRC_URI[sha256sum] = "bf2489db87ff98644498145cb1c85c40ab79287b96fb4532ddfaaa7d183c2678"

SRC_URI += "file://0001-add-NO_CMAKE_FIND_ROOT_PATH-in-find-to-org.kde.KWall.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Wallet, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Wallet, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}"
