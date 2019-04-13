SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "be37764f55cb5deed630da21af9385a9"
SRC_URI[sha256sum] = "4b98e7cd9b8d877326854addcee300071afc92f4378d3a94734e470271638002"

FILES_${PN} += "${datadir}/dbus-1"
