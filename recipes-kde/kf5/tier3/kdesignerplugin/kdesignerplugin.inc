SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "13090edbedfdbf0aa5385b9d5b77240f"
SRC_URI[sha256sum] = "9472332c5a8f7c27d6c581a4f0f4f837d82e2780c1f9b25f2f034afd1d250607"
