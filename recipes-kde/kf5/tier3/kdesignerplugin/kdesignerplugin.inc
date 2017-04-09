SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "67a5d750b0eb328b689af78582dcd67e"
SRC_URI[sha256sum] = "7a9ae55111b8c4ccb89e46fd3699d5b346de74fe40167b99daab9ba7fa288eb8"
