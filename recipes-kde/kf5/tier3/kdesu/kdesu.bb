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
SRC_URI[md5sum] = "15674fef2daeb8db192b9ebd5ae09276"
SRC_URI[sha256sum] = "8af37b0ca1563c58e5f8446f66286b2d418946960575cf6f444ae314aa198f06"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
