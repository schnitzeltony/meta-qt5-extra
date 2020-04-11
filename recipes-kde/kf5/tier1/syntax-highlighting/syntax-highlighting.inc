SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "47d6dc62b11144601c50dc50860a1269"
SRC_URI[sha256sum] = "3cf6b66e240a5a537b6479f18da989a75132eb184987c8c5a57d421d07d706f9"

PV = "${KF5_VERSION}"
