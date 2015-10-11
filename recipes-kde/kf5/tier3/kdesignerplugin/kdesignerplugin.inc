SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f64f55e70dace3c167ef656c2e9e8498"
SRC_URI[sha256sum] = "98b7a439eaa0cc0c969286d2adab1086b9d8950b562a6a7e31b389d31de8c657"
