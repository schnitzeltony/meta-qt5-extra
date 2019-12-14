SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f78b039d0e2e678f04ed236893d7cd5b"
SRC_URI[sha256sum] = "2b68d848b086f274020334cadd28d212125e05a7fdd97ff97ac801aed80ec852"

FILES_${PN} += "${datadir}/dbus-1"
