SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "cf30b86038b669f905cc273a9cf1a9c7"
SRC_URI[sha256sum] = "a3d4d68c45f95133b4f242be24ecf88620478bbcd84ced1f1bea080667783746"

PV = "${KF5_VERSION}"
