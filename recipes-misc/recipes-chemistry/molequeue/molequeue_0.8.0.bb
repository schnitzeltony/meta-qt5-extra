SUMMARY = "Desktop integration of high performance computing resources"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=7ecaf7ba5c6acb29d489639dd3a7c1b9"

inherit cmake_qt5 cmake_lib

SRC_URI = " \
    https://github.com/OpenChemistry/${BPN}/archive/${PV}.tar.gz \
    file://0001-GenerateExportHeader.cmake-do-not-perform-compiler-t.patch \
"
SRC_URI[md5sum] = "2f49f3e28965af6fec8a6df37d8ec697"
SRC_URI[sha256sum] = "c191e396f3d882c911e331e6325ed4e2666b70d4316e458964e61d5af7c8cbba"

CMAKE_ALIGN_SYSROOT[1] = "molequeue, -S${prefix}, -S${STAGING_DIR_HOST}/${prefix}"

FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/libMoleQueue*.so"
FILES_${PN}-dev += "${libdir}/cmake"
