SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2de86355c477905d19ccc7b39d6f71a1"
SRC_URI[sha256sum] = "84d84f16890ec4cf74545e7c6ffd96d8979b8788ba018c86ff8bacdd487f93a1"
