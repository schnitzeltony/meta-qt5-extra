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
SRC_URI[md5sum] = "ff019e77f882e5fd8de804b54b387383"
SRC_URI[sha256sum] = "149e0320e05abe67140f88a50cbf95d48a075a2996e9b2e3c9d123e6d1417f29"

FILES_${PN} += "${datadir}/kservicetypes5"


