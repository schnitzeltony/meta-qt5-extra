SUMMARY = "KDE Text encoding library"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8e0c15990e84dfcfc5c85a88e2e0319b"
SRC_URI[sha256sum] = "23fc45bff07162fb00158587f2a4f1faaabd5a3a7fe0657bd87d551fcc22d6db"
