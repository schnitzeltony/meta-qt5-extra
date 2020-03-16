SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "ebfa189aec2de061cc0b80374dd4b62c"
SRC_URI[sha256sum] = "a857c743aa60b21eea7e4b986e8b195882aa2c18358412e767e68d93ce35e134"

PV = "${KF5_VERSION}"
