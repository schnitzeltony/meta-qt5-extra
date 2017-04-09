SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

SRC_URI[md5sum] = "ffdf799bbca1dc0a049a974d749e9e2f"
SRC_URI[sha256sum] = "58a66e902f7f4626e0adb7438bc7a3ab00a60db1026cbd4b0d7c2ec0353ac05a"

PV = "${KF5_VERSION}"
