SUMMARY = "Plasma-specific protocols for Wayland"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-base

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "c5493383d115171c3435ea9a21b3966860632a844544ffac8f54890436a51d38"
