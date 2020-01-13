SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4999bbc2e86667c565b1e0b4ea1f7261"
SRC_URI[sha256sum] = "34501be3ec85f0e71dba22669b3c862b297606e9bbff9aae466667c7075b6f8d"

FILES_${PN} += "${datadir}/dbus-1"
