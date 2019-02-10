SUMMARY = "Support for emoticons and emoticons themes"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "karchive kconfig kconfig-native kservice kcoreaddons kcoreaddons-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a088d5a2316ce177c17823a7383216e3"
SRC_URI[sha256sum] = "b06e06f5868a9f776ed73a830773565af0814486d1b8602a06a1c99a9c107d0f"

FILES_${PN} += " \
    ${datadir}/emoticons \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
