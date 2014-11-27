require ${BPN}.inc

DEPENDS += "${BPN}-native"

inherit cmake-lib

CMAKE_HIDE_ERROR[1] = "KF5Archive, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Archive, -S${includedir}, -S${STAGING_INCDIR}"
