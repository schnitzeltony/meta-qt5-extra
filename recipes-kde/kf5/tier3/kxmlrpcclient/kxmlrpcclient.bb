SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e927b5f35bf55be404a80dfce6b12629"
SRC_URI[sha256sum] = "b440c7769e4507d148564dfad8bdf8ae8592da37aeaeabd93eab13c64254d34d"
