SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "56f043b6cb745f308831b80d6a7b9cb2548f69221394c17095a399aecdc9f8c9"
