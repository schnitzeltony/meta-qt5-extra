inherit cmake_lib

CMAKE_ALIGN_SYSROOT:class-native[1] = "ignore"

CMAKE_ALIGN_SYSROOT[1] = "Gpgmepp, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
CMAKE_ALIGN_SYSROOT[2] = "Gpgmepp, -S${libdir}, -s${OE_QMAKE_PATH_HOST_LIBS}/"
