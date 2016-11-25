SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "d62450ff9da78fe5538f038721c21f12"
SRC_URI[sha256sum] = "dda1d0249dedc559cd2b659ecce14dab46a8240bc5e8d49069e97bccc09c7cf2"
