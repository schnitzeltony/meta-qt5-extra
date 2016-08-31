SUMMARY = "Library shared among Hawaii Shell and other projects"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit hawaii cmake_lib

PV = "0.6.90+git${SRCPV}"

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git"
SRCREV = "9886e727d0232208d393b8e63b0fe0f28311d8a6"
S = "${WORKDIR}/git"

CMAKE_ALIGN_SYSROOT[1] = "Hawaii, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "Hawaii, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dev += "${libdir}/cmake"
#FILES_${PN}-dbg += "${libdir}/hawaii/qml/Hawaii/Shell/Applications/.debug ${libdir}/hawaii/qml/Hawaii/Shell/Core/.debug"

