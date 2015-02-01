SUMMARY = "Daemon used to register global keyboard shortcuts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

DEPENDS += "liblxqt"

SRCREV = "4504880ff4c960a7cf1e971128c415390109feed"
PV = "0.8.0+git${SRCPV}"

FILES_${PN}-translations += "${datadir}/lxqt/translations/lxqt-config-globalkeyshortcuts"

CMAKE_HIDE_ERROR[1] = "lxqt-globalkeys, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_HIDE_ERROR[2] = "lxqt-globalkeys, -S${libdir}, -S${STAGING_LIBDIR}"
CMAKE_HIDE_ERROR[3] = "lxqt-globalkeys-ui, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_HIDE_ERROR[4] = "lxqt-globalkeys-ui, -S${libdir}, -S${STAGING_LIBDIR}"
