SUMMARY = "DAV protocol implementation with KJobs"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=e673a95e6911049cc1cadf00eac1f759 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kcoreaddons \
    ki18n \
    kio \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "03c8af96e7bb1b1d2d633e54c6362c7c2de078b8aba5654042b7a11d968efa31"
