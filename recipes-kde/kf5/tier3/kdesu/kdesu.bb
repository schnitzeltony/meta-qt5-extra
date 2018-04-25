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
SRC_URI[md5sum] = "d3c96b58853644036e5ca859ae9b9883"
SRC_URI[sha256sum] = "9e2a304e074fff4fdf2cf60fc99dde64d681d3c0c602e61c669fd54d8e65d67e"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
