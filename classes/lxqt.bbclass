inherit cmake_qt5 cmake_extra_sanity

HOMEPAGE = "http://lxqt.org/"

DEPENDS += "qtbase"

SRC_URI = "git://github.com/lxde/${BPN}.git;protocol=git;branch=master"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DPULL_TRANSLATIONS=Off \
    -DCLEAN_TRANSLATIONS=Off \
"

FILES_${PN}-dev += "${datadir}/cmake ${libdir}/cmake"

RDEPENDS_${PN} += "lxqt-l10n"
