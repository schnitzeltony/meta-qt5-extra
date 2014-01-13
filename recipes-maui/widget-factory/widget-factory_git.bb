DESCRIPTION = "Showcase tool for Qt widgets styles, designed for testing new themes"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.BSD;md5=9e96e13a1a76211bcdb0255a5d42b01d"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtquickcontrols hawaii-widget-styles"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=stable"
SRCREV = "9b82c2dfb265a02da660cec47df48897c039af78"
PV = "0.1.90+git${SRCPV}"

S = "${WORKDIR}/git"

#FILES_${PN} += "${libdir}/${QT_DIR_NAME}"

