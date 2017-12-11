SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "fc593a8fbb7ad9105d3f5cbab20025f9"
SRC_URI[sha256sum] = "0cf7fb843313863fd2faced3430d0974e5b7553275ba0a96db1e0a135c5aac42"

PV = "${KF5_VERSION}"
