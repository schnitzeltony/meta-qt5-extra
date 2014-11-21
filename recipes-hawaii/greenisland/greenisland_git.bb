DESCRIPTION = "Support library to make Qt-based Wayland compositors development easier"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c"

inherit kde pkgconfig

DEPENDS = "qtbase qtdeclarative qtwayland extra-cmake-modules-native ki18n"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=master"
SRCREV = "0fa9de031987630b2abde5290bac72322d20340b"
PV = "0.5.90+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/hawaii/qml/GreenIsland"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/GreenIsland/.debug"
FILES_${PN}-dev += "${libdir}/cmake"
