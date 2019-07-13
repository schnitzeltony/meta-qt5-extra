SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d0512509da62c45ebb907cf2e801133b"
SRC_URI[sha256sum] = "e5f3bef626027b3cd84873362a5c6ee26692ee99a394ef9d944741670b1ca322"
