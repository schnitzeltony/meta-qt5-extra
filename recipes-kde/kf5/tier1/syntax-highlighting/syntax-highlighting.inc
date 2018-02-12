SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "995b7d7e3b5ec614870e6fc60f060a11"
SRC_URI[sha256sum] = "611e6ddbd34f2410a2618cef32cc87b49757001da351369ac16c2b3ee6cd3d28"

PV = "${KF5_VERSION}"
