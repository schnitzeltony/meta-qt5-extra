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
SRC_URI[md5sum] = "628bd240ca7b69ab64ead67a95fd11f3"
SRC_URI[sha256sum] = "0fc15f80b8d6dfeee3876909e37f99bc1adb488e6e9d230002bc0f4bb01a8e28"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Su, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Su, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
