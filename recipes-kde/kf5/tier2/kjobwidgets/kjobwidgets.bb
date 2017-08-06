SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5c53678ceb2c2c6f868ccd1a93e4ddc9"
SRC_URI[sha256sum] = "97ad95e78dedef69500b68befd39b756bfa4773b737628c63efd4cc2efd69cd4"

FILES_${PN} += "${datadir}/dbus-1"
