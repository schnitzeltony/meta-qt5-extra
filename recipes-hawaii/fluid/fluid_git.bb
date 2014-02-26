DESCRIPTION = "Modules for fluid and dynamic applications development with QtQuick"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtquickcontrols"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=dev"
SRCREV = "e9ea587f6f34d8d18e662f5e7810c524c1fac722"
PV = "0.2.0+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/hawaii/qml/Fluid"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/Fluid/Extra/.debug"
