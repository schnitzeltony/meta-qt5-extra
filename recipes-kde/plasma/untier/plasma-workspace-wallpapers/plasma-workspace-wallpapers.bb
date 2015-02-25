SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "f371d6b2d7e933d861fc6ec655a0b3d0"
SRC_URI[sha256sum] = "1db8ce7814068fbf060a898ef15fa259c130932042e1cce8fc5dfebe9ee70b36"

FILES_${PN} += "${datadir}/wallpapers"
