SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwidgetsaddons ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "01f996ec574b17ea41e68e83851c0af4"
SRC_URI[sha256sum] = "0e26aa3d496c6b651f57b11bb2ced5da49538c17be403b4067a7bb5475a09f46"

FILES_${PN} += "${datadir}/dbus-1"
