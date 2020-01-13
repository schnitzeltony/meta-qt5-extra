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
SRC_URI[md5sum] = "5002319826e422ef7c646fa2e2a0aae6"
SRC_URI[sha256sum] = "ee600f15af2fb9a28ad15f7e0689d519211fa63b86f2e6c356bd32530ebdfa46"
