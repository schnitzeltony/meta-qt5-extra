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
SRC_URI[md5sum] = "1d03482ad18b4fcf5efdc08342dad0fd"
SRC_URI[sha256sum] = "2b078a429d094ebc20699f8f661a87f1bae5f0a41d9d93c1acf37f50fc3ad588"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
