SUMMARY = "Qt-style API to use freedesktop.org's AccountsService DBus service"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

PV = "0.7.0+git${SRCPV}"

SRCREV = "b1440d98c272cc1890378f44baa4631a8afb40db"
S = "${WORKDIR}/git"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/QtAccountsService"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/QtAccountsService/.debug"
FILES_${PN}-dev += "${libdir}/cmake"

CMAKE_ALIGN_SYSROOT[1] = "QtAccountsService, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "QtAccountsService, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
