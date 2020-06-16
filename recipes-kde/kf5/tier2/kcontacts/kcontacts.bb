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
SRC_URI[md5sum] = "2f39fb4bcb6d1a6715d12d55720f754d"
SRC_URI[sha256sum] = "57f511a624406b27a7de25c83deb4104c95e851f9fda4f6d94450155ab08f4bd"
