SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "ab44df7bdffa30c211568bf677456b8e"
SRC_URI[sha256sum] = "884b266cfcec466d7f86053c7bcefccf27b256651ad123656939c9bfe9e2ce67"

PV = "${KF5_VERSION}"
