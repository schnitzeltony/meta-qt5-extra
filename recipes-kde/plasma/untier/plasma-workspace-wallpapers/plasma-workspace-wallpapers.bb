SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "0aea8f581916dfeff0063f3cf3837a66"
SRC_URI[sha256sum] = "5aefa25cb27d3052b2540aabcb774398fd395b158bc7ead466923dcac64a8101"

FILES_${PN} += "${datadir}/wallpapers"
