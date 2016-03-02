SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "0655781d43086838d5578fd2c349b13b"
SRC_URI[sha256sum] = "975179e092db38dc5d7aaedc982b566e044969f8ec363a46d3d707e4cdcfb906"

FILES_${PN} += "${datadir}/wallpapers"
