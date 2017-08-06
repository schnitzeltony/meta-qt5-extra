SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "9a1baefeab4678561ee7cd6c8df8661b"
SRC_URI[sha256sum] = "925a8845cd3a1d1720753aaba80f364d59612d45a71de089531d5e8dfa94fdc5"

PV = "${KF5_VERSION}"
