SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "04ca38242b68802c5fc688d6701430d5"
SRC_URI[sha256sum] = "c69743cdafe74e7538baa7e857d9136b3a5a9122dcaecd3661be22ca0bf33aa5"
