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
SRC_URI[md5sum] = "4693d1a819907b023945eefc98469de4"
SRC_URI[sha256sum] = "532f1e89c7412e971db8c431d627d38144470ddf5c978a7fa9348e418b6cd3c3"
