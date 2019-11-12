SUMMARY = "Syndication Library"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 distro_features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += " \
    kcodecs \
"
PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "61fe5e1da6dd470fe9385f52f217df2b"
SRC_URI[sha256sum] = "bffcd673a70646c8cb683ed7b26f6ef251a2ffe439fc78123ccee4332b567b57"
