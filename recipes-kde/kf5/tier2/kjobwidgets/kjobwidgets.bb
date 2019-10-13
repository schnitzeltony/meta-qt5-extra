SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3b4c294cc37694f3bad02eeb45692ff8"
SRC_URI[sha256sum] = "f68e9cfd949a2c981e048fdde2905419853bb40f7a00bb43f6c9d45b5529e05d"

FILES_${PN} += "${datadir}/dbus-1"
