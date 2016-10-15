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
SRC_URI[md5sum] = "0202665b3216aa922ed558db6ffee08d"
SRC_URI[sha256sum] = "2a0c387fc7dd96fd6c50f943e3d414f03d06eab3560200c85ff17901c20fa0d0"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
