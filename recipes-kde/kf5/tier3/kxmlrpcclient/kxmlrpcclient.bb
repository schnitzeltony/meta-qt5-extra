SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f96a30cd05a3c5c2fd6d77bf95706a8b"
SRC_URI[sha256sum] = "d47d5cc49f050dda3a26f7654226c0d124ca5ba5503a60e606307426bbe43b9d"
