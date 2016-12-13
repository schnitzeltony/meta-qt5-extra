SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "a4f3c901877e1ae8e723a97c5e9344b2"
SRC_URI[sha256sum] = "cbcca052a1ad79b4d1ed1209d6f8e9ba0c3812dc158b26c4a8232a8d879c7839"

PV = "${KF5_VERSION}"
