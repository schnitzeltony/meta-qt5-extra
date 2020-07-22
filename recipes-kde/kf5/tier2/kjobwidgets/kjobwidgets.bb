SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "93789cc307749d9d6022a8029bfb32af"
SRC_URI[sha256sum] = "1fed82f179ce4fbe6f20802bac48e7f598ec4aeb5ffe2bb1a8ce5c28dcaf978b"

FILES_${PN} += "${datadir}/dbus-1"
