inherit cmake-lib

DEPENDS += "${BPN}-native"

# native binaries
CMAKE_HIDE_ERROR[1] = "Qt5Help, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"
CMAKE_HIDE_ERROR[2] = "Qt5LinguistTools, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"
