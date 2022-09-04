SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "3e62f58e8b52b670fa9fc8ef525c2d53635b3fd9f9042c725aec84157f7559ee"

FILES:${PN} += "${datadir}/wallpapers"
