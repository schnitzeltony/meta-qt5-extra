SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "gperf-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9cf8636f8ecd5699dc4cff2cd003bdaa"
SRC_URI[sha256sum] = "4bd6fd48268d83b59f1b3c8ee19a50d9bee72f3601098dd5bb8e4b24a8912111"

do_compile_append() {
    # gperf-native sets absolut debug comments/links in header
    sed -i 's:${STAGING_DIR_NATIVE}::' ${B}/src/kentities.h
}

