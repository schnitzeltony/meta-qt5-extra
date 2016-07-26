SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "7cfa14c1aa5ce0372233b2fa69a12e8d"
SRC_URI[sha256sum] = "e0bd6cd6973630ec6fe951a12266ada561b72bcae500679e42acff20da69e34e"
