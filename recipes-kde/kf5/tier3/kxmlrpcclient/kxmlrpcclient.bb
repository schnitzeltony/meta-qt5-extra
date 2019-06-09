SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d0cedf608321c5389709484f864a6146"
SRC_URI[sha256sum] = "aa80b69d5be12ac6fc3b46a1f262af06a45b86000b1df59345bd2d013a8f4ff0"
