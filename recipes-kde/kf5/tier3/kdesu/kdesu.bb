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
SRC_URI[md5sum] = "f85faafcbdbf994bdb8b4cbcd7c85f03"
SRC_URI[sha256sum] = "13c94cb501fc3abdeec23bd133ef1f7c875f6c56951e8755593a791b6a24e305"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
