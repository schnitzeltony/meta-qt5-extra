SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "9188f0f3a3c802ffd25f4c0dcb0abdba"
SRC_URI[sha256sum] = "6f997556feb84f04907bbf5b2981d148a5a7075aa175f34e772b4afc5d1598fa"
