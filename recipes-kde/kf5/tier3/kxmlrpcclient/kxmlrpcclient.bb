SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bb1058cbd1142e34e2b5dbbed790e507"
SRC_URI[sha256sum] = "30b3e3367ae81c57e3c43abb734c1d10e9ee78bb1dc4cc3a9c71c61b09418e17"
