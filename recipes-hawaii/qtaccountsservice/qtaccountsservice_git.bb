DESCRIPTION = "Qt-style API to use freedesktop.org's AccountsService DBus service"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5 pkgconfig hawaii-target

DEPENDS = "qtbase qtdeclarative"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=stable"
SRCREV = "2e919a648434bcf1391b244b09b469020094cf68"
PV = "0.1.1+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/hawaii"
FILES_${PN}-dev += "${libdir}/cmake"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/QtAccountsService/.debug"
