SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f8dbb449bbb8c29e949eb9077b8cd40f"
SRC_URI[sha256sum] = "e49f2ab649aafb292e01dacefb7b6f28fc596606764bef61e7ce622b67241324"
