SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "988bff4927d2230d8a98f2b9597cfd05"
SRC_URI[sha256sum] = "faa68493b57f7f3a3e1b05775da0a0477320f712e62cde499f6d0f0befb54caa"
