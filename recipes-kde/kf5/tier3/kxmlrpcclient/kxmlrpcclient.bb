SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "37660386855ba6da79ea1c64809fcf4e"
SRC_URI[sha256sum] = "1853ace6f175c53425291326158b6f6210f2cadbd027e0a47de959b70b625fa1"
