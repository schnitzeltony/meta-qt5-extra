require ${BPN}.inc

DEPENDS += "${BPN}-native kcoreaddons"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Auth, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Auth, -S${includedir}, -S${STAGING_INCDIR}"
# native executables
CMAKE_HIDE_ERROR[3] = "KF5Auth, -S${libexecdir}, -S${STAGING_LIBDIR_NATIVE}/${BPN}"
