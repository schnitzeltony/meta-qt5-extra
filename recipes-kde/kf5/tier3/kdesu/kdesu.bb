SUMMARY = "Integration with su for elevated privileges"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    kcoreaddons \
    kservice \
    kpty \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "250d7641fab53f241b8c1a6b586fca28"
SRC_URI[sha256sum] = "adab63b45de0b5b614a4b5185658782d5ae1a6ef0c96792927b3ff3adf9f5b2e"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Su, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Su, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
