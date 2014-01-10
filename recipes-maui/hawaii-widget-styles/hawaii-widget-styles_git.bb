DESCRIPTION = "Styles for applications using QtQuick Controls"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtquickcontrols fluid"

SRC_URI = " \
	git://github.com/mauios/hawaii-widget-styles.git;protocol=git;branch=stable \
	file://0001-Do-not-ask-qmake-for-qml-directory-it-will-point-to-.patch \
"
SRCREV = "55d1b2ecc4b3728eeccc634a4ef319ca7cc54e56"
PV = "0.2.0+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/${QT_DIR_NAME}"

