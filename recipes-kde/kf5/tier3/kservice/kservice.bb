SUMMARY = "Advanced plugin and service introspection"
LICENSE = "GPLv2 | GPLv3 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kconfig kconfig-native kcoreaddons-native kcrash kdbusaddons ki18n kdoctools-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "da3837c37c31983e2f485cd858cbee1a"
SRC_URI[sha256sum] = "a7f4765cda131b1a21060a4328401381a9346d19cfaf033c7fc12cbc3117a060"

FILES_${PN} += "${datadir}/kservicetypes5"


