SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "996d8eb8b7a0a4ed26d13d09a0038709"
SRC_URI[sha256sum] = "56ef2d962e2e662ce46f2856a96c11281c46927935b014369921c456920b215c"

FILES_${PN} += "${datadir}/wallpapers"
