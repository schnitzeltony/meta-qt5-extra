inherit cmake_qt5 cmake_extra_sanity qt5-translation

HOMEPAGE = "http://lxqt.org/"

DEPENDS += "qtbase"

SRC_URI = "git://github.com/lxde/${BPN}.git;protocol=git;branch=master"
S = "${WORKDIR}/git"

# REVISIT: configure to use only ${libdir}/cmake
FILES_${PN}-dev += "${datadir}/cmake ${libdir}/cmake"
