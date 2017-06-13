inherit cmake_qt5_extra

HOMEPAGE = "http://lxqt.org/"

DEPENDS += "lxqt-build-tools qtbase qttools-native"

SRC_URI = "git://github.com/lxde/${BPN}.git;protocol=git;branch=master"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DPULL_TRANSLATIONS=Off \
    -DCLEAN_TRANSLATIONS=Off \
"

FILES_${PN}-dev += "${datadir}/cmake ${libdir}/cmake"
