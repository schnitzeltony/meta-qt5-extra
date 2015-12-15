SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "f548bcfab1f262bd0a3de54cf6d4daa2"
SRC_URI[sha256sum] = "317f3204ce070d42efb3ae208f9f151e817890da7c64d21eedb26db9d85b4bf0"

FILES_${PN} += "${datadir}/wallpapers"
