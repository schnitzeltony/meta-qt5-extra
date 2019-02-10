SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "22e294d6a362245a0b9a9da19eb84262"
SRC_URI[sha256sum] = "681402ad3527821459cfc0db5ac85f4248ca913f150737fafb522e27b6e5e394"
