SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "73e07356ad5a3c9a0aedb1bed8d33d06"
SRC_URI[sha256sum] = "f7c894eb36d00f4ec239954ff2d295d7f1d0375a9ade19745eb686d8abde3900"
