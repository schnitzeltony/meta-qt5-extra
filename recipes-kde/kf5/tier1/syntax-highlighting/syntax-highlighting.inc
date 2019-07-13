SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "db65057619ecd72a118e739b8a3d2c63"
SRC_URI[sha256sum] = "45ada4dca20641654a2d076ecb45b9ef78a4aa8032afe54ade33f140cdca504d"

PV = "${KF5_VERSION}"
