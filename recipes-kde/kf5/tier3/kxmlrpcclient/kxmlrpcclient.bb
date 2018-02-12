SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1c769bc468e07d91ae21ae7ddff7fd09"
SRC_URI[sha256sum] = "76179b324edd620f3713a6b05c1db341d8c4113e242a76af531b2b3c0fe62931"
