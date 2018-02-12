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
SRC_URI[md5sum] = "9bd2f0271f0d9cf422ab3add939780f6"
SRC_URI[sha256sum] = "65f72eb0ce7ebddc46f196a3ff6ddf3493465d80b3cffa3ddecf2a16543695c0"
