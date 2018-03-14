SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "fa61f52f4167f67fea89a2650aff39ae"
SRC_URI[sha256sum] = "d51673590c71cee09c773f0be57a4e2e63fd5115ee1f5691a533b0a455a84583"

PV = "${KF5_VERSION}"
