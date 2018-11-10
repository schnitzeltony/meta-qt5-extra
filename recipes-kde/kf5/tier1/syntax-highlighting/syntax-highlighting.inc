SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "ae98e0911cf571d8b8cbe5505bf4c4be"
SRC_URI[sha256sum] = "293817aaf2088496343006aa8059de54b6183018c1f5b92f00a9944365f46137"

PV = "${KF5_VERSION}"
