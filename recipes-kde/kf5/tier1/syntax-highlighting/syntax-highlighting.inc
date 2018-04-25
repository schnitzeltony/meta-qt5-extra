SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "80bdb9eea28f17c456a87eaadf984a42"
SRC_URI[sha256sum] = "63903b51971dc98f9509e9d02d057f95ed53d9dcfd1583f904df4c6dd597e3ec"

PV = "${KF5_VERSION}"
