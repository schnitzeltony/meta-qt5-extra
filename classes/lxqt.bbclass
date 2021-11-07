inherit cmake_qt5_extra pkgconfig

HOMEPAGE = "http://lxqt.org/"

DEPENDS += "lxqt-build-tools qtbase qttools-native"

SRC_URI = "git://github.com/lxqt/${BPN}.git;protocol=https;branch=master"
S = "${WORKDIR}/git"
