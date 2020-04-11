SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "627cddc3cc3f4387245471920f3495ff"
SRC_URI[sha256sum] = "bce2dcf7a8290168c6057343e82ea0b1d0cce4f51cf8f161dc99e951c5d7c74e"
