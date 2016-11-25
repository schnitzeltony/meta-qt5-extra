SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8867250588914f30d08b7482239647d1"
SRC_URI[sha256sum] = "161e662bdf05d07f506c4ed2e9a89818f7b0988eb192d74d91abde5efae742e0"
