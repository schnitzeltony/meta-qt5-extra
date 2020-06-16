SUMMARY = "Addons to QtDBus"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "eba02af01de7e92141a3cff0c35405e3"
SRC_URI[sha256sum] = "b441f525248d9d675333cebedf97ee0232a3a9b7aa9aff84d825dfcdb3bcd23c"
