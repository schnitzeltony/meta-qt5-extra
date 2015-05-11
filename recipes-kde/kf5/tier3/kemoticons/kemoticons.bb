SUMMARY = "Support for emoticons and emoticons themes"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "karchive kconfig kservice kcoreaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "68860ec9f2ef32b3d2a5ed9b61b0ae17"
SRC_URI[sha256sum] = "79bee710ec31f1385930f95a2d2c98310b286fc3e9457d4ecf02363009907044"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Emoticons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Emoticons, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/emoticons \
    ${datadir}/k*5 \
    ${libdir}/${QT_DIR_NAME}/plugins \
"
FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/plugins/kf5/.debug \
    ${libdir}/${QT_DIR_NAME}/plugins/kf5/*/.debug \
"
