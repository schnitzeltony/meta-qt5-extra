SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "302e06bd05b8632fe60702c82218d1eb"
SRC_URI[sha256sum] = "2a6c34bcf1195376061062da7cc1197b7526e46b4515fd107d244db6ae34ed45"

PV = "${KF5_VERSION}"
