SUMMARY = "Wind theme for Maui and Hawaii"
LICENSE = "GPLv2 BSD LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.BSD;md5=9e96e13a1a76211bcdb0255a5d42b01d \
	file://COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtquickcontrols plasma-framework"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=master"
SRCREV = "cc5d4de41aaeb63611701c0a739a93bc31bccf50"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DENABLE_WIDGETS_FACTORY:bool=ON"

PACKAGES =+ "${PN}-grub ${PN}-plymouth ${PN}-widget-factory"

FILES_${PN}-grub = "/boot"
FILES_${PN}-plymouth = "${datadir}/plymouth/themes"
FILES_${PN}-widget-factory = "${bindir}/*widget-factory"
FILES_${PN} += "${datadir} ${libdir}/qml"
