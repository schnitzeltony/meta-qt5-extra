SUMMARY = "Text completion helpers and widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e4062d29440bf1d7bde8246a1c1e4365"
SRC_URI[sha256sum] = "fa10ca49b35c581f4e9d5302b348a6e3ad1334bc833273938718d248622466d5"
