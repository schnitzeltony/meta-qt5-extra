SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3ef99c394387e8ef87ee317945a7b42a"
SRC_URI[sha256sum] = "c284c3e5962d2ed6d0737e5814b85fa4d7926131b7799272cb56c464a12c4530"
