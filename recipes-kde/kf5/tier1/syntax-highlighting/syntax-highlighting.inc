SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "80f0a8aa8d87168493de99fb2c05eff7"
SRC_URI[sha256sum] = "9a29d8311ab41d74edcea71795658193f5221517870ff5e8ee4b07cc38a9c023"

PV = "${KF5_VERSION}"
