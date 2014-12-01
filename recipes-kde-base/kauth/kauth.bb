require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native kcoreaddons polkit-qt-1"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Auth, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Auth, -S${includedir}, -S${STAGING_INCDIR}"
# executables: REVISIT there is no native backend
CMAKE_HIDE_ERROR[3] = "KF5Auth, -S${libexecdir}, -S${STAGING_LIBDIR}/${BPN}"
