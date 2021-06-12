SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "1d057d38de293ef59f2ecfe37b5edb2eb4572c008cf694e61f17634d4442cf14"

FILES_${PN} += "${datadir}/wallpapers"
