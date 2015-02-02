require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native libpcre"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5JS, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5JS, -S${includedir}, -S${STAGING_INCDIR}"
