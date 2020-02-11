SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "gperf-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "080f45c31980d514774161d1b4a30ff8"
SRC_URI[sha256sum] = "4fb9d2d2142306ff60b0855923be20a2a4d959075379c86c9af7023e20bdbab2"

do_compile_append() {
    # gperf-native sets absolut debug comments/links in header
    sed -i 's:${STAGING_DIR_NATIVE}::' ${B}/src/kentities.h
}

