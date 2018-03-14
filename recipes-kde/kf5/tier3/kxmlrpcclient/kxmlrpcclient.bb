SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d157ecc705e20697b4c2812b5ec92702"
SRC_URI[sha256sum] = "430a487ce68e92bdc772613a2cda009c29fc9f54de091f258253dba71e67d5e4"
