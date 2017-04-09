SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwidgetsaddons ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "55f208d17666d2b26f8ab0465cc4faa7"
SRC_URI[sha256sum] = "9f01d28cb6a81680221b56e6cefbcf10aa70c5ebb61f167e2a7785d8d5794d05"

FILES_${PN} += "${datadir}/dbus-1"
