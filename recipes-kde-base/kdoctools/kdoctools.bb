require ${BPN}.inc

DEPENDS += "${BPN}-native karchive ki18n libxslt libxml2"

inherit cmake-lib

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5DocTools, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5DocTools, -S${includedir}, -S${STAGING_INCDIR}"
