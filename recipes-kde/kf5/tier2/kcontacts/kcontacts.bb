SUMMARY = "ibrary for working with contact information"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext features_check

REQUIRED_DISTRO_FEATURE = "x11"

DEPENDS += " \
    kconfig-native \
    kcoreaddons-native \
    kcoreaddons \
    kconfig \
    ki18n \
    kcodecs \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f4b313c4003e380102119c9000c9e647"
SRC_URI[sha256sum] = "08086f554eb4718e91a9e96d143ba05fc741289928db9bcc21b21ca7125b0017"
