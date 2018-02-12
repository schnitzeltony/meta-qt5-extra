SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "81d0d0108fbed55099227c616d88aa1b"
SRC_URI[sha256sum] = "86f94668487c2cc4b767549860516431b835d924702501e9d37ca933ce3731cf"

FILES_${PN} += "${datadir}/dbus-1"
