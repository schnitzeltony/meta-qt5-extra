DESCRIPTION = "Styles for applications using QtQuick Controls"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtquickcontrols fluid"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=dev"
SRCREV = "138fffab7cc60bd6e910ac257a338f1c5e1670e2"
PV = "0.2.90+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/hawaii"

