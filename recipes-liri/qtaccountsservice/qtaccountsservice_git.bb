SUMMARY = "Qt-style API to use freedesktop.org's AccountsService DBus service"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

SRC_URI += "file://0001-remove-Werror-from-build-flags.patch"
PV = "0.7.0+git${SRCPV}"
SRCREV = "b1440d98c272cc1890378f44baa4631a8afb40db"
S = "${WORKDIR}/git"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/QtAccountsService"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/QtAccountsService/.debug"

CMAKE_ALIGN_SYSROOT[1] = "QtAccountsService, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
CMAKE_ALIGN_SYSROOT[2] = "QtAccountsService, -S${libdir}/lib, -s${OE_QMAKE_PATH_HOST_LIBS}/lib"
