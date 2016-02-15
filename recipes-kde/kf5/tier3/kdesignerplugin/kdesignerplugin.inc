SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "be9704c908fe4a7d8ab04b14192f9948"
SRC_URI[sha256sum] = "4573434c533a6ee601383b7f8c97611b77db82535610447a36e9e4a8fcae3686"
