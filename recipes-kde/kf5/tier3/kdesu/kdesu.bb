SUMMARY = "Integration with su for elevated privileges"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    kcoreaddons \
    kservice \
    kpty \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9a593607c47472dd6ce0d546b2f2a736"
SRC_URI[sha256sum] = "5df9ac9064b85433d392a805f29adcf4f231cb23c58d28c87d1789ff47defb57"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
