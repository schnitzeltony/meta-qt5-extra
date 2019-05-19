SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "a93c3854a98a7616f02676cd2d6f1ed3"
SRC_URI[sha256sum] = "b97e58e9fe64bc21368d18c57b69dd5696328a0722c01ae2e113826e2e35ba76"

PV = "${KF5_VERSION}"
