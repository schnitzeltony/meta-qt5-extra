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
SRC_URI[md5sum] = "ff57dbae99d31603c36f9b59a2f88780"
SRC_URI[sha256sum] = "2d0632e80011fc19ff611d73c6e996211146b66743d9f5e67c5423374d03bd12"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
