SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "8d8c5bf7ccf842f529364d0f5020ff91"
SRC_URI[sha256sum] = "845ae0c7b8523c23c3ad704a6c551260a358d96b0094a5c2b062879e58173f84"

PV = "${KF5_VERSION}"
