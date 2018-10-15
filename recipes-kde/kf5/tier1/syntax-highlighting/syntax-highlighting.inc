SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "cc3d26738a0eca9218ca262b9344cdda"
SRC_URI[sha256sum] = "47a36d7976b8332dd23992a558a5e0953e428d2b4f8429ab4d480cd14ba90d52"

PV = "${KF5_VERSION}"
