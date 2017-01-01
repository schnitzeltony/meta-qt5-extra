SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "823f448957159a58a7a24cae558114ad"
SRC_URI[sha256sum] = "0f22b0912f746eb2de60244381f730ad27e406a6161df91d7cca108ef5ac263b"
