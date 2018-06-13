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
SRC_URI[md5sum] = "ca4fc3d275eff07ce44a643f577629a2"
SRC_URI[sha256sum] = "79bb672375c2f4cd883998ba7494e3a431384d348eaffceae71c44d246d882e5"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
