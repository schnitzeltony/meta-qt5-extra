SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ba814954d8506f44f3f683a427f4628c"
SRC_URI[sha256sum] = "d43ea4eede2d88edd1753f4d1b6808bf04bf1e67ab58f00ef70b6a20b9607133"

FILES_${PN} += "${datadir}/dbus-1"
