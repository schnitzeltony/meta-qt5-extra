SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "40c0bfab00d45324d232d94001903126"
SRC_URI[sha256sum] = "d5fc5cf9f96133fc47d18bc740dc73fcd977dce03fe083d1b61f1c9a7eb58503"

PV = "${KF5_VERSION}"
