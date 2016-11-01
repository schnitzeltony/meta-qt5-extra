SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "555043b0cdeb1cfdb00ee45ec5dec7c6"
SRC_URI[sha256sum] = "b0cbc515af77d7542f68dfb0b81c8db47e4c136a75a86af05d0e0e2e4bc8d8a1"
