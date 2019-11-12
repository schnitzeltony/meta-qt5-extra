SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "4266efccbf1500c4375b270e013060fd"
SRC_URI[sha256sum] = "9655fa79d99fb7d585ae1a11c03d204c83263fe19391e7610575fb0436052b5f"

PV = "${KF5_VERSION}"
