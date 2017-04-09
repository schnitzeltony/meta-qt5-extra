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
SRC_URI[md5sum] = "2140e252bd2fcb833332333f485b5eef"
SRC_URI[sha256sum] = "0a4d5f14b0d05fc0de99a1d696fcb6d9821086914d6b777a1767e8278db64c1b"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
