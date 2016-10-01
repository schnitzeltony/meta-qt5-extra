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
SRC_URI[md5sum] = "223f0c4a3e96672602c85e8ced2c7a8d"
SRC_URI[sha256sum] = "1a631bee9e766af51d5c50c1faced5bdad009fc048203b3a03172a09d7cfb84f"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
