SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c42e7e8f410efc36d38d50426fa03033"
SRC_URI[sha256sum] = "2b29df46f16c606488238c7936b8cfc198f06549e01ad4b52cae0cb66fa85282"
