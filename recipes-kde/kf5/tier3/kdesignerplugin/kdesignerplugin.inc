SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4e68fcc75c98efbb52ad10cc93f94cac"
SRC_URI[sha256sum] = "2939f1d27669cab056425756db4308111059083b577abdb9f52eda749fb437b0"
