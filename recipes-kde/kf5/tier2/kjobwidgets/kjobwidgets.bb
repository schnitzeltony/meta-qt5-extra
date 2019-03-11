SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f61a3f12abe0fb2b8c25cfa834dcf68e"
SRC_URI[sha256sum] = "3ea6001724c82e2158f6ee3719f7b4974f271b056661fac037b39ce2338d04b6"

FILES_${PN} += "${datadir}/dbus-1"
