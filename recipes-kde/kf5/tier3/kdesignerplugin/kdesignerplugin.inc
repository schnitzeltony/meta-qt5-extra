SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5267dd2cd57ca07d319238a1946e32f2"
SRC_URI[sha256sum] = "46f25a411858f9c3126344a4530bbcf989687de49ecde358aa4f9df6e91af64c"
