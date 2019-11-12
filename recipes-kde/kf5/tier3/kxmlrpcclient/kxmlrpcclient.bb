SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "49dce029316e248018f7f63476a48203"
SRC_URI[sha256sum] = "8c36472cb69a2d5eeb88c437907f7b0b46703ef34d04df7b45a8c90eb95fd6b0"
