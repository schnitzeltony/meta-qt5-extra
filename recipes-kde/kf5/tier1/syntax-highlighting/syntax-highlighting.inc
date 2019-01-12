SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "198d4530c031caa4033fc0d05348f7ba"
SRC_URI[sha256sum] = "1496e8a8ea264b21ee5bd89d3c04a6c6ff26ea50c3de222cc3a810f6d6bc5508"

PV = "${KF5_VERSION}"
