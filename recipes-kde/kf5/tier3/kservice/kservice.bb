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
SRC_URI[md5sum] = "be8f136e6b4834a5efbb15a3615b5514"
SRC_URI[sha256sum] = "a2e105ae8202fa0d9f443490c56e25083c0b9ee285aa82fa26bb8a14f9999db8"

FILES_${PN} += "${datadir}/kservicetypes5"
