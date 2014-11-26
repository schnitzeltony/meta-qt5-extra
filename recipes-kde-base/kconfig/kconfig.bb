require ${BPN}.inc

DEPENDS += "${BPN}-native"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF -DSESSION_MANAGEMENT=${@base_contains("DISTRO_FEATURES", "x11", "ON", "OFF", d)}"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Config, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Config, -S${includedir}, -S${STAGING_INCDIR}"
# native executables
CMAKE_HIDE_ERROR[3] = "KF5Config, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"
CMAKE_HIDE_ERROR[4] = "KF5Config, -S${libexecdir}, -S${STAGING_LIBDIR_NATIVE}/${BPN}"

