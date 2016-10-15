SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c9242129fad28f635abe448445e107a3"
SRC_URI[sha256sum] = "61abedec062b2c71593c0f26632f9659217ac306e2957e0c9b21138951dd6a9d"
