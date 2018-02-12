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
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9ad92bfb68e7646bc7e4dea2140b348c"
SRC_URI[sha256sum] = "a69169d7de137f2810f287c49aa0281038c53b6bd8c879298967fea22b0a94d6"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
