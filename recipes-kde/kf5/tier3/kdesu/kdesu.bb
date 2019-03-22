SUMMARY = "Integration with su for elevated privileges"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    kservice \
    kpty \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d5a2b995e7c3558c6489c0fa9f2555b5"
SRC_URI[sha256sum] = "949a23837de945131042e795daaa8a1abc4d9e03cf149cc9cea78636573e8739"
