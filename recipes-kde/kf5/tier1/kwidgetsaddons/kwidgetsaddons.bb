SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3c6aa861640fd55a34e359ef798a916d"
SRC_URI[sha256sum] = "2251de1577e7d1e379e9d9fa301e3d2705e821b8863ee3dd0d882d69d3c72fbb"
