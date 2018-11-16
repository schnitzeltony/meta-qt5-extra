SUMMARY = "Desktop integration of high performance computing resources"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e64c567d31d109fd44cbe6f1fe113daa"

inherit cmake_qt5 cmake_lib

SRC_URI = " \
    https://github.com/OpenChemistry/${BPN}/archive/${PV}.tar.gz \
    file://0001-Avoid-RPATH-if-not-configured.patch \
"
SRC_URI[md5sum] = "28e707668bfaf2ebc615da54fc98002f"
SRC_URI[sha256sum] = "7dd234742c8d73be95281fedf4ed9d09648ecc351afb5f098cd32f48c3df3bd5"

EXTRA_OECMAKE += "-DENABLE_RPATH=OFF"

CMAKE_ALIGN_SYSROOT[1] = "molequeue, -S${prefix}, -S${STAGING_DIR_HOST}/${prefix}"

FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/libMoleQueue*.so"
