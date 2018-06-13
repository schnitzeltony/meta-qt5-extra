SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2c0b335b64ab8264c3ff4154584a1763"
SRC_URI[sha256sum] = "f72e3c095477238b8357508d500821417f5e18444b2a43b65d7c5d6747c56f17"

FILES_${PN} += "${datadir}/dbus-1"
