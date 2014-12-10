require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Config, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Config, -S${includedir}, -S${STAGING_INCDIR}"
# native executables
CMAKE_HIDE_ERROR[3] = "KF5Config, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"
CMAKE_HIDE_ERROR[4] = "KF5Config, -S${libexecdir}, -S${STAGING_LIBDIR_NATIVE}/${BPN}"

PACKAGES =+ "${PN}-bin"

FILES_${PN}-dbg += "${libdir}/kconfig/kf5/.debug"
FILES_${PN}-bin = "${bindir}/k*"
