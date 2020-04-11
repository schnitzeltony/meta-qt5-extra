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
SRC_URI[md5sum] = "89fb4d950f76130b4dff091a6248d3ce"
SRC_URI[sha256sum] = "fcf59f7db66ec65fe27a3c6f04eb2426bd47d5c7048d19f9d2b2c3d94c75a3c8"
