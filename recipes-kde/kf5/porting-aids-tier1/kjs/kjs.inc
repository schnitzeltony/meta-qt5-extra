SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde perlnative

SRCREV = "12cf97b33e96dc45de0486d3dd5501c99a768a54"
S = "${WORKDIR}/git"

