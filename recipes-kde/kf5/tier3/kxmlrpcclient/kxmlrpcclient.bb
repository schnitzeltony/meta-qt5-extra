SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1b0795cb55ddaa30db7a10f02f3d56db"
SRC_URI[sha256sum] = "2c215687514d0c2f71f4fcf25d9a104e1ab6822eeb03fd8e9f17df28bb67024d"
