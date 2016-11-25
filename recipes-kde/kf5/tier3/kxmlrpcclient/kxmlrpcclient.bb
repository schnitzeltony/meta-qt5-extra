SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4b51b6442c81cf610e3ddab33033ae16"
SRC_URI[sha256sum] = "a175c4290b086fbecca3fe4291c99b16c6f0e5b7eddc7ec16650357a63812df7"
