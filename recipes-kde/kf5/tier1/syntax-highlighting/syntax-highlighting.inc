SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "9cb5b2eb63776bf69fa196f45fd53675"
SRC_URI[sha256sum] = "14c1832e268c8053cc0ef9ff00415794801e518f9c103328eca661a657d8803e"

PV = "${KF5_VERSION}"
