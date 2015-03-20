require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5CoreAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5CoreAddons, -S${includedir}, -S${STAGING_INCDIR}"
# native executables
CMAKE_ALIGN_SYSROOT[3] = "KF5CoreAddons, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"

PACKAGES =+ "${PN}-bin"

FILES_${PN} += "${datadir}/mime"
FILES_${PN}-bin = "${bindir}/desktoptojson"
