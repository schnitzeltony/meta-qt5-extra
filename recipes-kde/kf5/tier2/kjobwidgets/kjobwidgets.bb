SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwidgetsaddons ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c574baab5459479b84c300921cc8be95"
SRC_URI[sha256sum] = "04254403cf3de9458466e12283a0fc60c156c3be92848e1e5032462a5e1d1b52"

FILES_${PN} += "${datadir}/dbus-1"
