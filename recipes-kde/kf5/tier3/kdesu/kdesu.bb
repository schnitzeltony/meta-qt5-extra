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
SRC_URI[md5sum] = "1e19e1abd6486ff0b24912a32b549558"
SRC_URI[sha256sum] = "9d9b1d202ad09993dd6c0bfe3bf4738e1867dc563bcd49b664e3026534fc5b0d"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
