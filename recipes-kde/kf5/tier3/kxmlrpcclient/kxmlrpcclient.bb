SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e1933952b0ac2b74feb32c6456d987d5"
SRC_URI[sha256sum] = "87b4974fc87f40bf5c51e81c22f372b855b0c0eecc32908f1817cc563abd4e3b"
