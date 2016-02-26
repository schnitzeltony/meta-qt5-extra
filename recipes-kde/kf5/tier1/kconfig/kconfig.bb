require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native"

SRC_URI += "file://0004-kconf_update-fix-paths.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Config, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Config, -S${includedir}, -S${STAGING_INCDIR}"
# native executables
CMAKE_ALIGN_SYSROOT[3] = "KF5Config, -S${libexecdir}/kf5, -S${STAGING_LIBEXECDIR_NATIVE}/kf5"

PACKAGES =+ "${PN}-bin"

FILES_${PN}-dbg += "${libdir}/kconfig/kf5/.debug"
FILES_${PN}-bin = "${bindir}/k*"
