SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwidgetsaddons ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e9fd5f5377ada71d70af520e2aff3fd9"
SRC_URI[sha256sum] = "c8ee18380c1cae2ab48f007d10b4e85625bf7a2f2d5dba834f4f0bf0bb1e356a"

FILES_${PN} += "${datadir}/dbus-1"
