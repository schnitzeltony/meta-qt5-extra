SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "4036e7bcb0c3fb6c5907d0efac365234"
SRC_URI[sha256sum] = "475392c03534d7b5301ff2e02461444e463ad4def985da81ad4b315660416721"

PV = "${KF5_VERSION}"
