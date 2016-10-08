SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "98d3d35ce3a28f1f161a9db38fa7e5b7"
SRC_URI[sha256sum] = "6b8a5016d66d7d9d9b0160a9443d0c9706712cf827b3807225bc689f132faa73"
