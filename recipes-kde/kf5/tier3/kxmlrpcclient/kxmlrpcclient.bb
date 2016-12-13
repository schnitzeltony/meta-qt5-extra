SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a3e322b81ad230a33907efe4ec28d5f4"
SRC_URI[sha256sum] = "629dc2d17b1e4f89fe0074010dc8b4c53269f9be426e432826b23c0a5a243c27"
