SUMMARY = "Make Qt applications look gnomeish"
HOMEPAGE = "https://github.com/FedoraQt/adwaita-qt"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit cmake_qt5 features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS = "qtbase qtx11extras"

SRC_URI = "git://github.com/FedoraQt/adwaita-qt.git;branch=1.4;protocol=https"
SRCREV = "07859143fd733cfefae687f6967795c7f50d4ca8"
PV = "1.4.2"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DQT_PLUGINS_DIR=${OE_QMAKE_PATH_PLUGINS} \
    -DCMAKE_BUILD_TYPE=Release \
    -DCMAKE_INSTALL_PREFIX=/usr \
"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}"
