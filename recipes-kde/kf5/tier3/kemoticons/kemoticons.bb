SUMMARY = "Support for emoticons and emoticons themes"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "karchive kconfig kconfig-native kservice kcoreaddons kcoreaddons-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b59d5cfd0b6be360b5377d3cd061db6a"
SRC_URI[sha256sum] = "e03fe81ad34e107dc5fe61f9bf424ecef7716bf8a62f8abb78fd3f6bd6806f56"

FILES_${PN} += " \
    ${datadir}/emoticons \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
