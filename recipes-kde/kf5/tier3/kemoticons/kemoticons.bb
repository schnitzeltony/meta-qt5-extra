SUMMARY = "Support for emoticons and emoticons themes"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "karchive kconfig kservice kcoreaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9c5e2e6b1c3643508d507675318b55f7"
SRC_URI[sha256sum] = "d4125c19db3d4c18ed7a97a9e63607ec5a379c9aaea1ebb968818210744f6a40"

FILES_${PN} += " \
    ${datadir}/emoticons \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
