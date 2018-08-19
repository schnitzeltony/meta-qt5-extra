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
SRC_URI[md5sum] = "57a2a02a7061040a6a437a1df6dacbd8"
SRC_URI[sha256sum] = "b398a310d4f84e049f8f41cbe65a2baa9b6a72a7d75eb985ce73611c8a5f9bbf"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
