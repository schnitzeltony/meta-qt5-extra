inherit cmake_lib

DEPENDS += "${BPN}-native"


# It's really time for us to publish cmake_lib.bbclass
SRC_URI_remove = " \
    file://0004-linguist-tools-cmake-allow-overriding-the-location-f.patch \
"

# native ignore
CMAKE_ALIGN_SYSROOT_class-native[1] = "ignore"
CMAKE_ALIGN_SYSROOT_class-nativesdk[1] = "ignore"

# cross -> native binaries
CMAKE_ALIGN_SYSROOT[1] = "Qt5Help, -S${bindir}${QT_DIR_NAME}, -s${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}"
CMAKE_ALIGN_SYSROOT[2] = "Qt5LinguistTools, -S${bindir}${QT_DIR_NAME}, -s${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}"
