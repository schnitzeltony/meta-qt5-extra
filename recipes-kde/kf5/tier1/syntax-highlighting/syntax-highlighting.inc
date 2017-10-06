SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "5cb3fa13c05ed0ba59348eb2ba52e727"
SRC_URI[sha256sum] = "d4b887e2b4c0bb0d0c723325b11897d1ab38a644e3276d57eae8393928783680"

PV = "${KF5_VERSION}"
