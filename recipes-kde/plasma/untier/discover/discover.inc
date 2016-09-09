SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c9149fa73c463e6dee961ccb545648c1"
SRC_URI[sha256sum] = "9fa3826ce8aec0f29bc12ceb00a4423624e8c0d3a414a3f094958279d8b18403"
