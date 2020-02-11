SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "91319edc9d27393df6812d60f1505b99"
SRC_URI[sha256sum] = "17354132c266733027af784cd4b9002cbde16b09a9cfaff5cdc5096dcadc7777"

PV = "${KF5_VERSION}"
