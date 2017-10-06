SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0970500fa7bc1ed484bdcefd513fed80"
SRC_URI[sha256sum] = "4a79382406f247bd9ace01859cb92948e74e48c7abb94b9e47066f0453812a3d"
