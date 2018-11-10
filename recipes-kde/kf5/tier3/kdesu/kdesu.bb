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
SRC_URI[md5sum] = "0fd68cc6ec04ee3709365e3aa167d5f8"
SRC_URI[sha256sum] = "821f7929564bcbf756d64f564a28d8697004e8dcb22845db37d6c422107ea1a2"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
