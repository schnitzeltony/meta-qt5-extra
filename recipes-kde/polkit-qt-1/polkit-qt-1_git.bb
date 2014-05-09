DESCRIPTION = "PolicyKit Qt wrapper"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=7dbc59dc445b2261c4fb2f9466e3446a"

inherit cmake_qt5 hawaii-target

DEPENDS = "qtbase polkit glib-2.0 extra-cmake-modules-native"

SRC_URI = "git://anongit.kde.org/polkit-qt-1.git;protocol=git;branch=master"
SRCREV = "bac771e69887c9253f2b0973f6310810db0061f8"
PV = "0.103.0+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN}-dev += "${libdir}/cmake"
