inherit cmake_qt5

HOMEPAGE = "http://lxqt.org/"

DEPENDS += "qtbase"

SRC_URI = "git://github.com/lxde/${BPN}.git;protocol=git;branch=master"
S = "${WORKDIR}/git"

# REVISIT: configure to use only ${libdir}/cmake
FILES_${PN}-dev += "${datadir}/cmake ${libdir}/cmake"

#REVISIT pack translations per language to use image linguas
PACKAGES =+ "${PN}-translations"
ALLOW_EMPTY_${PN}-translations = "1"
FILES_${PN}-translations = " \
    ${datadir}/lxqt/translations/${BPN}* \
    ${datadir}/lxqt/translations/lxqt-config-* \
"
REDEPENDS_${PN}-translations = "${PN}"

