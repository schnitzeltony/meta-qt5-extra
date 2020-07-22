SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "2d69012533dd9baaeef58929c19e30a0"
SRC_URI[sha256sum] = "7faf0f620eec7bc0ab8f0dd72b45113b3fab0f9ec85dc6d2215b86dd34c8258f"

PV = "${KF5_VERSION}"
