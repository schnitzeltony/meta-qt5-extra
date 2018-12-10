SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "130b79df792e0cd4be15a0f9fec54278"
SRC_URI[sha256sum] = "6dfed4dc083ecce8e6d83438f6a80c747e6b253b75d59c21fe0ee05da40bda1e"
