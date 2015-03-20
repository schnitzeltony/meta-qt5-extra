require ${BPN}.inc

DEPENDS += "${BPN}-native"

inherit cmake-lib

CMAKE_ALIGN_SYSROOT[1] = "KF5Archive, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Archive, -S${includedir}, -S${STAGING_INCDIR}"
