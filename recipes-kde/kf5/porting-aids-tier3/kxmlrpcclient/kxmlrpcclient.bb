SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5-porting-aids gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f9aa73a0ed97767c56d3715b9957fcb0"
SRC_URI[sha256sum] = "22102e31a0ef6c0007f1e87382fd0b4501151e7604f1d6605feb10fd5a5e55a2"
