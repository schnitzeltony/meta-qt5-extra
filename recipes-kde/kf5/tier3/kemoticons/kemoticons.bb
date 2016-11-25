SUMMARY = "Support for emoticons and emoticons themes"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "karchive kconfig kservice kcoreaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c6330f659f9c70c0c2ed139d07564dc8"
SRC_URI[sha256sum] = "dbaf7ba6814f8f7a5d00053aa452e2a8cd580738a0219702796be97570aa1d83"

FILES_${PN} += " \
    ${datadir}/emoticons \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
