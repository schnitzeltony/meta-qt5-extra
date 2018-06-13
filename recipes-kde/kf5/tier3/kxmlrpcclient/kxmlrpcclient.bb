SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "06a15a6e9258cfa9321899c744eeb824"
SRC_URI[sha256sum] = "11e575aefd760eda9a1414bc72de97e6a98bd53a64530dd46d92faf22ef3baf2"
