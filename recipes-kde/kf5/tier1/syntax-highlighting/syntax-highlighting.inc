SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "79483ab26b782ead8d9937e055c5ab80"
SRC_URI[sha256sum] = "4b0e25e2e0070e52f0e463dc876087dc1613910df644757512c3a0ab313d568a"

PV = "${KF5_VERSION}"
