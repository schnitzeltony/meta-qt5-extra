SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4ca1ac3fd1d98a08baf8f70536c6a27a"
SRC_URI[sha256sum] = "53f647bb8d9165ddf6326703486470c7e9fc4ef392991501319e5c69f25f0ea3"
