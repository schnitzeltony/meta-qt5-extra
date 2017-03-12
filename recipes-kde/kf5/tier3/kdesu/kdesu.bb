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
SRC_URI[md5sum] = "a0fb51feb46bedfb99d7461a9181a7d3"
SRC_URI[sha256sum] = "140ebb81d6c3370785ccefce51aa1575824eab38f2dd79f3676b15bf230c5e7f"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
