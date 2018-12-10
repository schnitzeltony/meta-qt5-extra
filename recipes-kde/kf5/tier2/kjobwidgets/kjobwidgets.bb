SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3437728b6b9a09a59720d86392c05624"
SRC_URI[sha256sum] = "40983b7b7e777ad79f962cdc19f97f9fd58ccd338f6b7e882a8b051574c03c98"

FILES_${PN} += "${datadir}/dbus-1"
