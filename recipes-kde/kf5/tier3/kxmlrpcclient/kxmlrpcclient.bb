SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bb0ffae515ea0e5cf3b1019882c67249"
SRC_URI[sha256sum] = "a181b54e093a257309d960c797159e7bcbeccee7aa5b59e4e708880045eca793"
