SUMMARY = "Advanced plugin and service introspection"
LICENSE = "GPLv2 | GPLv3 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    bison-native \
    kconfig-native \
    kdoctools-native \
    kcoreaddons-native \
    kconfig \
    kcrash \
    kdbusaddons \
    ki18n \
    kdoctools \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c3a1aecfb1c47925049f4bb9540b4694"
SRC_URI[sha256sum] = "93ff8eef9bafccec78fe972aefd8d839086c9e3e13a8affc35d8e5c813bfaae5"

FILES_${PN} += "${datadir}/kservicetypes5"
