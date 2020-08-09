SUMMARY = "Addons to QtCore"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 mime

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "24a7713eaef2f40e648a586e22b030192321f9fecdbae77013b00446fa0d6d51"
