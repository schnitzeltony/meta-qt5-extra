SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kcoreaddons ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1164eaa12b7586174e738d12762807fe"
SRC_URI[sha256sum] = "e562a3f8c66d9f442b7265baafeeba72ba4f25433b623d17214a780c6fc39575"
