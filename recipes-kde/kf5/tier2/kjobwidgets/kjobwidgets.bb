SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f73e32096eb129548a6b1618a3068101"
SRC_URI[sha256sum] = "3776250553eb34ca591c03fade6c9cc0b1299de28c0d113abf09b84c2bb78b1e"

FILES_${PN} += "${datadir}/dbus-1"
