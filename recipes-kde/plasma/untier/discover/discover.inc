SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "143c4916451cbb7153a33ad16fb100f4"
SRC_URI[sha256sum] = "045c60e726e840b4a5ac31007b22fd1fa9534a289f68cd2c66f98cd84c6ef503"
