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
SRC_URI[md5sum] = "e48ca2a44622c676226303ca3a97badb"
SRC_URI[sha256sum] = "347e03d802c7b8363521cd509ec15a0ae949d7b009ace7e345da2aa386dc97de"

FILES_${PN} += "${datadir}/kservicetypes5"
