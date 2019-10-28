SUMMARY = "Make Qt applications look gnomeish"
HOMEPAGE = "https://github.com/MartinBriza/adwaita-qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit cmake_qt5

DEPENDS = "qtbase"

SRC_URI = "git://github.com/MartinBriza/${BPN}.git"
SRCREV = "828d3eec5ee60216a7c2e68ff08c23667aff14bd"
PV = "1.1.0"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DQT_PLUGINS_DIR=${OE_QMAKE_PATH_PLUGINS} \
    -DCMAKE_BUILD_TYPE=Release \
    -DCMAKE_INSTALL_PREFIX=/usr \
"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
