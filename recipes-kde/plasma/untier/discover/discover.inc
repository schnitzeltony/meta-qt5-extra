SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "fa24d9027a7bac1f1472f21369ffba88"
SRC_URI[sha256sum] = "734781f705a077cffefc821e87ce186513e33cf0a20e64ef9d1b535cc2c5d206"
