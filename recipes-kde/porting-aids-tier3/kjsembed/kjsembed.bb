require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native qtsvg"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5JsEmbed, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5JsEmbed, -S${includedir}, -S${STAGING_INCDIR}"

# native executables
CMAKE_HIDE_ERROR[3] = "KF5JsEmbed, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"
