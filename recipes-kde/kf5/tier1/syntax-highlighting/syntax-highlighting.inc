SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "801915ffd6e45c6d042f2bce591432f2"
SRC_URI[sha256sum] = "5ac5cffeed055adb7f1ef734bab41268dcfbf5e0abdefcf82df2be4479dfc97b"

PV = "${KF5_VERSION}"
