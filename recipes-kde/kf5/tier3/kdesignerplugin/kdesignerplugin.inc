SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cea06789eb647b75c92f4b6a2f4016ba"
SRC_URI[sha256sum] = "6b204dffbb4897f51143650d75383b5a3ddf4254455e5827d316c7b4ee7b3f33"
