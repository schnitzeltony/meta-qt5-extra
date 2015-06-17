SUMMARY = "Add support for global workspace shortcuts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    kconfig \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bbdc7503aa7bb3d7be82a5a206520c97"
SRC_URI[sha256sum] = "bedf7dd6e5c0d5328383b66eb08108e783a1d2a0bac64fd500c763685421b4c4"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5GlobalAccel, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5GlobalAccel, -S${includedir}, -S${STAGING_INCDIR}"

FILES_SOLIBSDEV = "${libdir}/lib*Accel${SOLIBSDEV}"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/kservices5 \
    ${libdir}/libKF5GlobalAccelPrivate.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
