SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "43c632420f2d7694f4235fe66487c205"
SRC_URI[sha256sum] = "a11ba51ed0ab330f9a921cf0a61e604c27d88c1c2ea477a875bc0a0cd228a292"

FILES_${PN} += "${datadir}/dbus-1"
