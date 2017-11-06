SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6ab70e1ac35ce0a57cf7dae370818b8c"
SRC_URI[sha256sum] = "faa3e3af7b85c3bf679fc991d5ff2ef3c4f068a7e516885215c6d2e6870d8ac8"
