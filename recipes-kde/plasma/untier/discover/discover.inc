SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "e6fb355e76af797bb9d254437af5dd12"
SRC_URI[sha256sum] = "cc5468a64bbd8669f4a06d50c53ca16b326a7a41aa3d0d1341436742bbaf78c4"
