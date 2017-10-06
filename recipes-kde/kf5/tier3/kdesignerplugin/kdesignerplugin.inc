SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1751dd862efc2e354fdfe976b1fb1c56"
SRC_URI[sha256sum] = "c6038ac44f05083e6d1e7e2d8b950b31d493f1bf587f4b89984fefae5f973b66"
