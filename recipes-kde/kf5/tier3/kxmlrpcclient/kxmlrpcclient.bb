SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "354e45b75119676fb673bce110f040cd"
SRC_URI[sha256sum] = "ad0e4d98b0cdc39193c2f9e7abf4a0403fa38fb97120c49f1454960aca52e34e"
