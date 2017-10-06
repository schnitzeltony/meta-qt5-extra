SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fcff1ca599c3d40a1d1ba58a637454ba"
SRC_URI[sha256sum] = "a5340df37ba44f6b5b82f8c6732aaaa42ffc6d9a829c15b345e824360eb3e66e"

FILES_${PN} += "${datadir}/dbus-1"
