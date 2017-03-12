SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f86085312a316db6eaeebeb362d5a3c3"
SRC_URI[sha256sum] = "5875d0b5910696adce067b4076f8293deab070d58db6f06e2df036d756fc4ccd"
