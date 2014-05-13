DESCRIPTION = "Modules for fluid and dynamic applications development with QtQuick"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtquickcontrols"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=dev"
SRCREV = "6e0a3f723874c3df9bb75161e6a11fc2b5061acb"
PV = "0.2.0+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/hawaii/qml/Fluid"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/Fluid/*/.debug"
