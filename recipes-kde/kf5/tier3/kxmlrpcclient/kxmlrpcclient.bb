SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "604ee822d3c31c025ea90a64692db277"
SRC_URI[sha256sum] = "04f202129c07decbcaef5bf5a227fe7250e0efbf12ea76b3e18cfd5ffb502f44"
