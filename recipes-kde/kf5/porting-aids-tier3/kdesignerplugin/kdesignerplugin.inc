SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "eda29268e2fcc487f9b5327f50b2a6a1"
SRC_URI[sha256sum] = "622a76c429eb8eef63e59e95a41bf73ab22c07209de8d8b743fd7bf1147b2637"
