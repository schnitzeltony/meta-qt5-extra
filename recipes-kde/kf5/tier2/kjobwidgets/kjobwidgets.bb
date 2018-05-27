SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "736ee2bbe38de09f3a5dfbb125181f83"
SRC_URI[sha256sum] = "0e06331399597913d16d84ca59b35635658d160319c9f07e6db83ac0ceee3589"

FILES_${PN} += "${datadir}/dbus-1"
