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
SRC_URI[md5sum] = "57e7acfc570c56c9f44d6fdcc995c6a7"
SRC_URI[sha256sum] = "25b35914fa9cab6f70d09970324385d7ea14f3edb6ff1908bc12e403e31732b1"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
