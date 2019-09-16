SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "69dec0767fe5abb8a3fc1688f928f2fa"
SRC_URI[sha256sum] = "897fac9ec2e5112d629da464d47223129e547c314369e1518a12c5c94ff2a6fd"

PV = "${KF5_VERSION}"
