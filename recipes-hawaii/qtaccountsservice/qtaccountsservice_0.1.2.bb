SUMMARY = "Qt-style API to use freedesktop.org's AccountsService DBus service"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5 pkgconfig

DEPENDS = "qtbase qtdeclarative"

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git"
SRCREV = "19fa06f44cbd31aff07d6a2200f898181792a04d"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/hawaii"
FILES_${PN}-dev += "${libdir}/cmake"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/QtAccountsService/.debug"
