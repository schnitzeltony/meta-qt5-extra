SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "550af897cf2b536c0b3370c414f2e607"
SRC_URI[sha256sum] = "7e09a6817817ae0c40a897ae9e56e7657980115c95ae07101016d92bc9497ddd"

FILES_${PN} += "${datadir}/dbus-1"
