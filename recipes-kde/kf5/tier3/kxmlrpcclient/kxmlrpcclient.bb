SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4cb3774688e894dbafef91f3eb48379a"
SRC_URI[sha256sum] = "6b637c138414d93104477034737c9e866d99e43f883a3dfc45d3220df6c21e6c"
