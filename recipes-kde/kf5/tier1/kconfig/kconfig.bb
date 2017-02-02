require ${BPN}.inc

inherit cmake_lib

DEPENDS += "${BPN}-native"

# native executables
CMAKE_ALIGN_SYSROOT[1] = "KF5Config, -s${_IMPORT_PREFIX}/libexec/kf5, -S${STAGING_LIBEXECDIR_NATIVE}/kf5"

PACKAGES =+ "${PN}-bin"

FILES_${PN}-dbg += "${libdir}/kconfig/kf5/.debug"
FILES_${PN}-bin = "${bindir}/k*"
