SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "f50176753c157333fbd566a27bb6d205"
SRC_URI[sha256sum] = "acfd79f8d53269bae1d4876c737605f0e20c31d9453444fa98b8e296e06c1a2d"

PV = "${KF5_VERSION}"
