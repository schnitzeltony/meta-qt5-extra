SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "b979ea0b6b2d6fa27f61c152dada814a"
SRC_URI[sha256sum] = "e82261e791005a55414fc81a396ca33ee8c061acd66c2c351492d866b3592e9f"

PV = "${KF5_VERSION}"
