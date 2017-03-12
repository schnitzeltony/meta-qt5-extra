SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "c7b71c7330f3aa95d23d712b89d3b654"
SRC_URI[sha256sum] = "a31f5f66b642ffdb2839c6278428961839b2d13a2ca80561e5eff13a4a3f35b5"

PV = "${KF5_VERSION}"
