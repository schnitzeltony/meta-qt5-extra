SUMMARY = "Components for PSS applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtquickcontrols"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=master"
SRCREV = "292a7d4891b47f44cb3dcf896749ade9330e6ae0"
PV = "0.4.0+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/qml/PSS"
FILES_${PN}-dbg += " \
	${libdir}/qml/PSS/*/.debug \
	${libdir}/qml/PSS/*/*/*/.debug \
"
