SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwidgetsaddons ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "02541526678389fc7e6f6681506b5e5e"
SRC_URI[sha256sum] = "6bc57a8a4ed63ccee07631417dc26bb4286ba85b562a5f5a457ce86ce13b5050"

FILES_${PN} += "${datadir}/dbus-1"
