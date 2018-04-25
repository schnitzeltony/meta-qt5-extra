SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "29a087ba5667593c4f4f98f1c2c9f86a"
SRC_URI[sha256sum] = "72a2ae9d8a325e83632b4f60c966edb589bf9ef5f2d50f1bc595c6a98a7a1b3f"
