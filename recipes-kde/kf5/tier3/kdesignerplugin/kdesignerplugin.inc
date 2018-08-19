SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6b4322afedde3304387c459d133c5d1e"
SRC_URI[sha256sum] = "8d75b0fb2335ee220347c3327b012376cfc139c430474027e13b0b11c1b34442"
