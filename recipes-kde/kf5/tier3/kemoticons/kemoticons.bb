SUMMARY = "Support for emoticons and emoticons themes"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "karchive kconfig kservice kcoreaddons"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7a38172342fa120969b73d868e2b4211"
SRC_URI[sha256sum] = "072bdcfb2437f25e2d4bcc02bef7d80de200953bdd7f822c2649c005a40abb9d"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Emoticons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Emoticons, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/emoticons \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
