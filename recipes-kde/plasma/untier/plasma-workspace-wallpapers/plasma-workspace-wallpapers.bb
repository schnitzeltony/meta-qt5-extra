SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "48686605eb8c898d22940451c17d9c84"
SRC_URI[sha256sum] = "971f5638818e57cdf74835e5a72615b86b21069105d3dc09ff526a9a4b04f693"

FILES_${PN} += "${datadir}/wallpapers"
