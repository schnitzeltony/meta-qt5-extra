SUMMARY = "Support for emoticons and emoticons themes"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "karchive kconfig kservice kcoreaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "233e21ccdb6c144c68365aac0c36569f"
SRC_URI[sha256sum] = "aaf557fac8f12a8766e9e0dac06dffb2f3b7c7838c0c362cf3e5d22305db5723"

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
