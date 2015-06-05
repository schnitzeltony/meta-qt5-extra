inherit cmake-lib

DEPENDS += "${BPN}-native"

# native binaries
CMAKE_ALIGN_SYSROOT[1] = "Qt5Help, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"
CMAKE_ALIGN_SYSROOT[2] = "Qt5LinguistTools, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"
