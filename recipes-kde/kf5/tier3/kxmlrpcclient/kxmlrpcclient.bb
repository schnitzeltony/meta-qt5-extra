SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "424f8d787c02dc1c9729171b2c591eb7"
SRC_URI[sha256sum] = "382b4730e4b32c1d300f8fdb6269e40995ec282ebe1cbb044ab1a2b2b68c3a1a"
