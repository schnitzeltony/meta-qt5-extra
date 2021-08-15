SUMMARY = "Make Qt applications look gnomeish"
HOMEPAGE = "https://github.com/FedoraQt/adwaita-qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit cmake_qt5 features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS = "qtbase qtx11extras"

SRC_URI = "git://github.com/FedoraQt/adwaita-qt.git;branch=1.3"
SRCREV = "906c4d8e63b5a6cd2c54511ca5d6062515a79c5f"
PV = "1.3.1"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DQT_PLUGINS_DIR=${OE_QMAKE_PATH_PLUGINS} \
    -DCMAKE_BUILD_TYPE=Release \
    -DCMAKE_INSTALL_PREFIX=/usr \
"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}"
