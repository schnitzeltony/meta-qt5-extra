SUMMARY = "Base applications for the Hawaii desktop environment"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit cmake_qt5 pkgconfig

DEPENDS = "qtbase qtdeclarative polkit-qt-1 extra-cmake-modules-native"

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git"
SRCREV = "fb3495d281fac91e27f00121de7c3bb2da90a7db"
PV = "0.0.0+git${SRCPV}"
S = "${WORKDIR}/git"
