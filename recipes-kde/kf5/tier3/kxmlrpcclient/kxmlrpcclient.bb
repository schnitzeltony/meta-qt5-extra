SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "407f0314880f487aa82a0d87adb253d9"
SRC_URI[sha256sum] = "4850b4ab65a2e54a9bc6415bb0ec2762eeebbb4079093187485e351188bd86fd"
