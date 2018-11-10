SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fc42adfbd144591fb6824d2e36509ba4"
SRC_URI[sha256sum] = "8db46460457b696662a78d307949529356b1c2f6c6c540b957d866eb217ddf75"
