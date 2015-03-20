require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native libpcre"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5JS, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5JS, -S${includedir}, -S${STAGING_INCDIR}"
