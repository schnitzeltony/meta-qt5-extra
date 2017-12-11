SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fe298ffdfee126f9ba3bcdef1118fcdf"
SRC_URI[sha256sum] = "27e66dc96c787069583dc44a80f29c27a3ac0e3482a8694664df28146637f678"
