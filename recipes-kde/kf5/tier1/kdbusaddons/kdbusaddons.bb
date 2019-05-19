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
SRC_URI[md5sum] = "2c0b68f305c296ab785c65d356ae0f45"
SRC_URI[sha256sum] = "42f176b737f81e120d2fa78c20891b3b7e3f182c6e144ec9c99935a32d63f9b1"
