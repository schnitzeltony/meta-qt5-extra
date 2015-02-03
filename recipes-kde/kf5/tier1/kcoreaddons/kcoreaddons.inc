SUMMARY = "Addons to QtCore"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRCREV = "e8cf6542fdbe137bbff40a22bfc50f810daa38fd"
S = "${WORKDIR}/git"
