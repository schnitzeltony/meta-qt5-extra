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
SRC_URI[md5sum] = "61bdaac204a894bf71d30d1f77a20c4a"
SRC_URI[sha256sum] = "c80e78f93fc627342f801ac3b636bb63b3e0478bdc0e915efba89ec23b5e4611"
