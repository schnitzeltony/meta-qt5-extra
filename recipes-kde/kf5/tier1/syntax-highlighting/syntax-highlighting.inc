SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "ab7de9568bec23ad56f11183570dee07"
SRC_URI[sha256sum] = "bdf7041e05eda6fcffda6e2fcc60e283fa84e8f7dbdd5ecb85134f36a8d967a1"

PV = "${KF5_VERSION}"
