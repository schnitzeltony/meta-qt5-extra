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
SRC_URI[md5sum] = "9410aa55239457b8d0eb97fc64357193"
SRC_URI[sha256sum] = "e916884bc64b7d2abaaed1bf42cb711c438516ced6a25d610b5f91ed0c854086"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
