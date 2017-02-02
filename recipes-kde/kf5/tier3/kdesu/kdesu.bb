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
SRC_URI[md5sum] = "9c4b00e60a94b1bb6dda8bd767e6ce0d"
SRC_URI[sha256sum] = "b3a265811f09048f45232af3a75b734c57b38a1b22be97e8d1290d72d535d4b2"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
