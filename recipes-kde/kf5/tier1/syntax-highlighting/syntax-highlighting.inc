SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "804147925416c49bcf831d68c0d89317"
SRC_URI[sha256sum] = "0c6c138605639a67ed33ca6ef843144f95cd1aec7ed836c44e14ee3e362b622f"

PV = "${KF5_VERSION}"
