SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "15ec5f8445a23415a1f51980d1dd40c8"
SRC_URI[sha256sum] = "7ee86f7b386b100bb725769202e3c2b037bde3971c450aa0f9e5021a79198084"
