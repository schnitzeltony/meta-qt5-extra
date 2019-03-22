SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "59fef0ceb831b41a514aea9d9ab59bab"
SRC_URI[sha256sum] = "9b06e67a05d6f90287edf6a7cc31b93c01c9e58f35ae456b6d89e8ef78e0953a"
