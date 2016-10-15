SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwidgetsaddons ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4fd4ab8f572b7418efb38ec6153f1217"
SRC_URI[sha256sum] = "14714e6aa92120aa1e2f409ebf5ee85221087395fac313cb77eb0c25e8978615"

FILES_${PN} += "${datadir}/dbus-1"
