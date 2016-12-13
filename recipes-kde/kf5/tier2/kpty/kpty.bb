SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7a6702b8b9bed61ce39057ac5a4a0b88"
SRC_URI[sha256sum] = "f1c077b1c15fb7182c1272fd311ee5c51bf8de149b7f63ddcce4a557c6c36821"
