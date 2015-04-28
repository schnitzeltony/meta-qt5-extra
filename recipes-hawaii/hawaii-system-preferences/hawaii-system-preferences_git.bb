SUMMARY = "System preferences for the Hawaii desktop environment"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtquickcontrols polkit-qt-1 extra-cmake-modules-native kscreen"

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git;protocol=git;branch=master"
SRCREV = "e60b281d6aad847802f1bf0aaa08f41eed1533a8"
PV = "0.4.0+git${SRCPV}"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools"

FILES_${PN} += " \
    ${libdir}/qml \
"

FILES_${PN}-dbg += " \
    ${libdir}/qml/org/hawaii/systempreferences/*/.debug \
"
