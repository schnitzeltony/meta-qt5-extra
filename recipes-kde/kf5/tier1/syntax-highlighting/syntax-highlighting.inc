SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=61be4d272e55cc2609d58596cf084908 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "62d67899a9cd5cd6b93761ebafd88942"
SRC_URI[sha256sum] = "aa31517936a6c19080c2a62519d7eecd4c369a881614f841028b5d82ac0225ab"

PV = "${KF5_VERSION}"
