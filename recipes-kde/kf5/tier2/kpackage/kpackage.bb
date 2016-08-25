require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native karchive ki18n kcoreaddons kconfig kdoctools"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Package, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Package, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[3] = "KF5Package, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"

FILES_${PN} += "${datadir}/k*5"
