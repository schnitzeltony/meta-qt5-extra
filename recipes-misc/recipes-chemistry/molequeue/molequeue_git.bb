SUMMARY = "Desktop integration of high performance computing resources"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e64c567d31d109fd44cbe6f1fe113daa"

inherit cmake_qt5 cmake_lib

SRC_URI = " \
    git://github.com/OpenChemistry/molequeue.git;branch=master;protocol=https \
    file://0001-Avoid-RPATH-if-not-configured.patch \
    file://0002-MoleQueueConfig.cmake-Find-include.patch \
"
SRCREV = "efcca963c478ea5fd7d9f56f619260480904c0f3"
S = "${WORKDIR}/git"
PV = "0.9.0"

EXTRA_OECMAKE += "-DENABLE_RPATH=OFF"

CMAKE_ALIGN_SYSROOT[1] = "molequeue, -S${prefix}, -S${STAGING_DIR_HOST}/${prefix}"

FILES_SOLIBSDEV = ""
FILES:${PN} += "${libdir}/libMoleQueue*.so"
