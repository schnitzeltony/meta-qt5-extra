SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[sha256sum] = "51ed4a68ba42d0dc88d91a0c11ac55ada199b7e93b0ff74b80b5e9304fe8901b"

PV = "${KF5_VERSION}"
