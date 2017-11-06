SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d16420f3acafe2cf5bd2a727c0b4ffab"
SRC_URI[sha256sum] = "ccfd26c54e15a854d4d86028e7339dcbe33b0c52412686b89b2dc7794b2946fc"

FILES_${PN} += "${datadir}/dbus-1"
