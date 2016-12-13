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
SRC_URI[md5sum] = "4373737720241ce5fb7ccabbadbf410f"
SRC_URI[sha256sum] = "854cce99c3cac9ca28fd3f7c74b39b7af9d88f63b82c021398819888b4767dd2"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
