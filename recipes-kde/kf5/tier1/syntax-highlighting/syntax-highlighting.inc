SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "b6c16c3c23f381e9060ae62bc44b934c"
SRC_URI[sha256sum] = "e572719cb64524c6abc476eeccca56f54cb0d7352fc747af3036dbe817566c25"

PV = "${KF5_VERSION}"
