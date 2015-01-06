SUMMARY = "System preferences for the Hawaii desktop environment"
LICENSE = "GPLv2 LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit cmake_qt5

# TBD: libhawaii is already marekd as abandoned
DEPENDS = "qtbase qtdeclarative qtquickcontrols polkit-qt-1 qtconfiguration libhawaii pss qtaccountsservice qttools extra-cmake-modules-native"

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git;protocol=git;branch=master"
SRCREV = "4f7aaed8fe5ace9d5efcdec160c963ff101c845f"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools"

FILES_${PN} += "${libdir}/hawaii ${datadir}/hawaii"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/Hawaii/SystemPreferences/Background/.debug"
