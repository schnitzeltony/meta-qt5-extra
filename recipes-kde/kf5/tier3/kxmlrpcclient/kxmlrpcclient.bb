SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e4c58263a8ec01858933402d9ec1a35d"
SRC_URI[sha256sum] = "5514c0749b2c601d1ab3241120bef0ad30e382a7994d71d0e0470fae266f46e9"
