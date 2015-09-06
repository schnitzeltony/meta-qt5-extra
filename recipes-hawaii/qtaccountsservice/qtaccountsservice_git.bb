SUMMARY = "Qt-style API to use freedesktop.org's AccountsService DBus service"
LICENSE = "GPLv2 & LGPLv2.1 & GFDL-1.3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git"
SRCREV = "2624cc812ae14bf9abee9634de0f4cc0ee0a5926"

S = "${WORKDIR}/git"
PV = "0.6.0"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/QtAccountsService"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/QtAccountsService/.debug"
FILES_${PN}-dev += "${libdir}/cmake"

CMAKE_ALIGN_SYSROOT[1] = "QtAccountsService, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "QtAccountsService, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
