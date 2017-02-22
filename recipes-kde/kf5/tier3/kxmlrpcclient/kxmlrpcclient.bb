SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c1cd0538b4f7e56653a4d6d4f2c994a2"
SRC_URI[sha256sum] = "6b3a121bcdd272b71fb0f1469ddd4796c7e1864e379cb0a0d03a54b73a0e3bd3"
