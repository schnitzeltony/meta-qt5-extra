SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d46bb44cb0def7813e5302cffed92e98"
SRC_URI[sha256sum] = "016f7a6a193293ef29ded12bce75f2749832101bfbb407239dbcec7a5eb27750"
