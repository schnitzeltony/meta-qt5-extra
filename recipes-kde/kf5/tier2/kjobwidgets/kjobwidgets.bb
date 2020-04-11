SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3bdd94741daf529f6683d53ef5223937"
SRC_URI[sha256sum] = "6d08b636f9f6bcd7eceb192590f6689ab6b468872917c1aaa1f401fc862d6f32"

FILES_${PN} += "${datadir}/dbus-1"
