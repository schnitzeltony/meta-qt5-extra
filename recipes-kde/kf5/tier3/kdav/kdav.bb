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
SRC_URI[md5sum] = "44b54cfdf62b7bcb09520ea9c6f3678b"
SRC_URI[sha256sum] = "0d98e04a9561866f42c033c680d63d4817be917d4381a59fc935522c8fba6461"
