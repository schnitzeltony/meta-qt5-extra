SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8f60ee2d97ac5762df318dee6e4627aa"
SRC_URI[sha256sum] = "4d72036b85800ae096ca2cc5b6c599c4fd922fb86edca8a171d6b9a3ef71b1dc"
