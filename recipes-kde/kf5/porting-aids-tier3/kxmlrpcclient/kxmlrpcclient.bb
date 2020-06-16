SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5-porting-aids gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "983d6efc0a78efc13845457ef9f4b860"
SRC_URI[sha256sum] = "5947de8ec9cd57d8ccf6ea8a764066733d2633d93e11f94ecfb47a75e1e7a91f"
