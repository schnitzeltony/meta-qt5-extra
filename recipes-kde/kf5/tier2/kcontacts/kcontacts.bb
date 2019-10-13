SUMMARY = "ibrary for working with contact information"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext distro_features_check

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
SRC_URI[md5sum] = "260aa977402f989a16891fc23a505a1e"
SRC_URI[sha256sum] = "10f0bb2cbcab33332830763a0f9313c0c5919c0d5dc974908965b24d68614577"
