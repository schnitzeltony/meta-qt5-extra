SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "b493af91f48ec46e60006ace153e7a22"
SRC_URI[sha256sum] = "3483c7b4133526331117d5778f7dc5393a0af098e88fe984c6542eb3207c6ef5"

FILES_${PN} += "${datadir}/wallpapers"
