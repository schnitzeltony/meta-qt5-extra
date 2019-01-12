SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "de0321df141bdb357a43b4f925774f58"
SRC_URI[sha256sum] = "b8bf2e4893b1a542bb07e5d5761a463add4e9e7637ff4bc6255a382a97ea7234"

FILES_${PN} += "${datadir}/dbus-1"
