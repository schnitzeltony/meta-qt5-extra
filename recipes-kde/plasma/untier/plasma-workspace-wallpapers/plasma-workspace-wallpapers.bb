SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "4dceee9550f7e433aeb2daa2a8dfee82"
SRC_URI[sha256sum] = "1de6e524506b00a2948c19175292dd02916e19fa9111c66a9dcefab3444bcb8b"

FILES_${PN} += "${datadir}/wallpapers"
