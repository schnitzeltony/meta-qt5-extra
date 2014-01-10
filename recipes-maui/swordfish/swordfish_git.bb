DESCRIPTION = "File manager"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtquickcontrols qttools-native fluid"

SRC_URI = "git://github.com/mauios/swordfish.git;protocol=git;branch=dev"
SRCREV = "cbe827869119b7b53bd18c7fce24cd7d4de99b8e"
PV = "0.1.90+git${SRCPV}"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools"

FILES_${PN} += "${libdir}/hawaii/qml ${datadir}"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/Swordfish/.debug"
