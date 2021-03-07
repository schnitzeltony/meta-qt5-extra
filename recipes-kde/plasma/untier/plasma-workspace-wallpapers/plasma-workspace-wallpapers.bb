SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "8f83fa295e92ad438d33380d784d19f79ef7c223ab26b0105623562fccf5142e"

FILES_${PN} += "${datadir}/wallpapers"
