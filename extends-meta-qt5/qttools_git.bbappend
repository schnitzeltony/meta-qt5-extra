inherit cmake-lib

DEPENDS += "${BPN}-native"

# native ignore
CMAKE_ALIGN_SYSROOT_class-native[1] = "ignore"

# cross -> native binaries
CMAKE_ALIGN_SYSROOT[1] = "Qt5Help, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"
CMAKE_ALIGN_SYSROOT[2] = "Qt5LinguistTools, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"
