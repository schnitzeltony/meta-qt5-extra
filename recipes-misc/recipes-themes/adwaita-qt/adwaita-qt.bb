SUMMARY = "Make Qt applications look gnomeish"
HOMEPAGE = "https://github.com/MartinBriza/adwaita-qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit cmake_qt5

DEPENDS = "qtbase"

SRC_URI = "git://github.com/MartinBriza/${BPN}.git"
SRCREV = "e5dfd0be75b31dc3b823de0c4bd320b9a6995b89"
PV = "1.1.4"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DQT_PLUGINS_DIR=${OE_QMAKE_PATH_PLUGINS} \
    -DCMAKE_BUILD_TYPE=Release \
    -DCMAKE_INSTALL_PREFIX=/usr \
"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
