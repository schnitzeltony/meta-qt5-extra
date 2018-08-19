SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "36d5ea545b972d275b4fde563202fed3"
SRC_URI[sha256sum] = "06c0dc10623ecb1b844c47577a53229c7d5789f895902fda9ef21c7decb69250"
