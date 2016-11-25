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
SRC_URI[md5sum] = "2c5f01bcaf40e3fe62144721f40f55c1"
SRC_URI[sha256sum] = "976f0054ed5fb4a51e0462cc0dde0249d6f1c15ad1e76047889a048dede2cab8"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
