SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5facd2f9401a33172c3b31ddbe83d7d3"
SRC_URI[sha256sum] = "406eb8a9f2028b6d057fde6e8027c22fc98c49ce6fc43826127229533dc0c122"
