SUMMARY = "Plasma-specific protocols for Wayland"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-base

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "08dcfa929033734f680560389a6e1df4"
SRC_URI[sha256sum] = "69c0fac42ccecaa78388f54725de493cad7ac798d85802225013c3e1fb7ee62b"
