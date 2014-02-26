DESCRIPTION = "Styles for applications using QtQuick Controls"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtquickcontrols fluid"

SRC_URI = " \
	git://github.com/mauios/${BPN}.git;protocol=git;branch=dev \
	file://0001-Do-not-ask-qmake-for-qml-directory-it-will-point-to-.patch \
"
SRCREV = "881d6887d506dd1eac13d9faa77050c3ff337817"
PV = "0.2.0+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/${QT_DIR_NAME}"

