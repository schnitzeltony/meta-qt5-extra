SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "gperf-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5e2fd0f6588523b30ab9c8ab53bb1d76"
SRC_URI[sha256sum] = "6e5b3c2083c840947e255d58b338128a5e498a4176969f6ac724d56ca3cae8ef"

do_compile_append() {
    # gperf-native sets absolut debug comments/links in header
    sed -i 's:${STAGING_DIR_NATIVE}::' ${B}/src/kentities.h
}

