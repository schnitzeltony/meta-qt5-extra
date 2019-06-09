SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "876d98fb07fc108426a02027187a8ded"
SRC_URI[sha256sum] = "8ed700bb070638a5e7ad33f45ba29bc88f9420ee1ece1230296e3da12b5e91f0"

PV = "${KF5_VERSION}"
