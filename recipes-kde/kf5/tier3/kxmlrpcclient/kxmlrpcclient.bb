SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c4295e2ebab459374b5570d2164a8279"
SRC_URI[sha256sum] = "3fce1446ae6799ac45e76680475b3a084ed49ae4637b6d6ab7cc637d24e8dbf1"
