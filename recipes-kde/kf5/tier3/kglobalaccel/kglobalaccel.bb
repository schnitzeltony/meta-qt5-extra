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
SRC_URI[md5sum] = "a290c0bd824e966e2a4963aa2440e74c"
SRC_URI[sha256sum] = "5942afd96e8e5c6b1adf71666f1bcecd9ce8ac16cd9e5fa3fc680097435b27c6"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5GlobalAccel, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5GlobalAccel, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
