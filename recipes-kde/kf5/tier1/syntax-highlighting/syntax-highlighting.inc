SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "4b9837a0c1bc5bdb9acd146e0004759b"
SRC_URI[sha256sum] = "bba4feeec9bae143a05821b0279c95fc7d8d673cca1e933bd8adfce8e67f339f"

PV = "${KF5_VERSION}"
