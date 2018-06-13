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
SRC_URI[md5sum] = "622e73f22de26a8fde0d915bd6e0f27d"
SRC_URI[sha256sum] = "a92d60aae5ebf99c1b518e39cb624b4da9a7f88ebc7e77e52722c1e677bdd167"

FILES_${PN} += "${datadir}/kservicetypes5"


