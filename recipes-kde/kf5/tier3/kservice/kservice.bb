SUMMARY = "Advanced plugin and service introspection"
LICENSE = "GPLv2 | GPLv3 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfig kcoreaddons kcrash kdbusaddons ki18n kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a5206a772b64c9031a2e6bf5b4cfe5de"
SRC_URI[sha256sum] = "94d0a1b55f9a2301c1d3e98ff0a0b141764efff2ba0d801ee339e00df81e8c56"

FILES_${PN} += "${datadir}/kservicetypes5"


