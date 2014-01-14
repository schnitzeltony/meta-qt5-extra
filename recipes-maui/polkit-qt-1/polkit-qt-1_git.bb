DESCRIPTION = "PolicyKit Qt wrapper"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=7dbc59dc445b2261c4fb2f9466e3446a"

inherit cmake_qt5

DEPENDS = "qtbase polkit glib-2.0 kde-extra-cmake-modules-native"

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git;protocol=git;branch=hawaii"
SRCREV = "05b6ac79c897de3e7610386a3c581534f1968bb0"
PV = "0.103.1+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN}-dev += "${libdir}/cmake"
