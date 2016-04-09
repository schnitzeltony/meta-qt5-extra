SUMMARY = "Qt-style API to use freedesktop.org's AccountsService DBus service"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE.LGPLv21;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git"
SRCREV = "74728c9f092ba7166b96414cb85e268f3c3ed4d1"

S = "${WORKDIR}/git"
PV = "0.6.0+git${SRCPV}"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/QtAccountsService"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/QtAccountsService/.debug"
FILES_${PN}-dev += "${libdir}/cmake"

CMAKE_ALIGN_SYSROOT[1] = "QtAccountsService, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "QtAccountsService, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
