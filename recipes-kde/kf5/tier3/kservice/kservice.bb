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
SRC_URI[md5sum] = "6ea954ece0c27070d1f5af2eb8942574"
SRC_URI[sha256sum] = "c774ce1738081c17e6e105e506aa89c22a9db07e73972d4b18ce733ec8ad0a8a"

FILES_${PN} += "${datadir}/kservicetypes5"
