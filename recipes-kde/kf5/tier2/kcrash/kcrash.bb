SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwindowsystem"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2c6644cc02b6c7c6b0b32f7331304502"
SRC_URI[sha256sum] = "481a22b799669d3b8ec98fada5da7e93d49ae87b4f21751d1afa0cff05cfc074"
