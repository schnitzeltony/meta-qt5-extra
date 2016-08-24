SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b3f68ae1839994631b1798db5a30385e"
SRC_URI[sha256sum] = "10b7484e9f5d41d29b776092059f67d128aa373b46413778b8ce8acfdef0aac8"
