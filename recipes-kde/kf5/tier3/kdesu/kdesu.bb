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
SRC_URI[md5sum] = "84fbce9781af3acaa7e0e94abfaa3405"
SRC_URI[sha256sum] = "b121d8c70954239e8aba99efa9cd8900f954b67bfbf7ae7032d8a982bc67a44a"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
