require ${BPN}.inc 

inherit cmake-lib

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5I18n, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5I18n, -S${includedir}, -S${STAGING_INCDIR}"
# revisit python?

DEPENDS += "${BPN}-native qtscript"
