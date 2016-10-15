SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6e310d2fb322a6f655d10ace999072db"
SRC_URI[sha256sum] = "3aa9154305eff97de123eb341021ce1e2fcb446d2bd8e3a5f5dfbfeb6e39bf9f"

FILES_${PN} += "${datadir}/wallpapers"
