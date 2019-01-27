inherit cmake_qt5_extra qt5-translation

HOMEPAGE = "http://lxqt.org/"

DEPENDS += "lxqt-build-tools qtbase qttools-native"

SRC_URI = "git://github.com/lxqt/${BPN}.git;protocol=git;branch=master"
S = "${WORKDIR}/git"
