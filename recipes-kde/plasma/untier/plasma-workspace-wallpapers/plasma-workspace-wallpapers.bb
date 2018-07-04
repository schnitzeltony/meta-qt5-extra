SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6fa4f5a3dce42de9dcd457d24abe7ff7"
SRC_URI[sha256sum] = "197157eb6101d1d5ee86b3c8e6fd4f793564665e59d00441ac314cf47bc8a72f"

FILES_${PN} += "${datadir}/wallpapers"
