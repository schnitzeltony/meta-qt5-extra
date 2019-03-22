SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "41ffd8e68e831b6e16ee6608821cd976"
SRC_URI[sha256sum] = "14a300a68ac6ade06206ebfc296c5ae2aa55b6f95629f87e19fb055108bd56ae"
