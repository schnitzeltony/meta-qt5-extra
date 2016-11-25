SUMMARY = "Secure and unified container for user passwords"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

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
SRC_URI[md5sum] = "409f1ea7882344b2f22ebc67150f91dd"
SRC_URI[sha256sum] = "3513813399f214e855ead5f12147a11e39d3ccd7b79c2ede2a5b0fcfe5ae4558"

SRC_URI += "file://0001-add-NO_CMAKE_FIND_ROOT_PATH-in-find-to-org.kde.KWall.patch"

FILES_${PN} += "${datadir}"
