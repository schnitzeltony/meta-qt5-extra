KDE_BRANCH ?= "master"

SRC_URI = "git://anongit.kde.org/${BPN};protocol=git;branch=${KDE_BRANCH}"

S = "${WORKDIR}/git"

DEPENDS += "qtbase extra-cmake-modules-native"

# extra-cmake-modules cause dependent to check for python
inherit cmake_qt5 pythonnative

FILES_${PN} += "${libdir}/plugins/kf5"
FILES_${PN}-dev += "${libdir}/cmake"
FILES_${PN}-dbg += "${libdir}/plugins/kf5/.debug"

EXTRA_OECMAKE += "-DECM_MKSPECS_INSTALL_DIR=${libdir}/${QT_DIR_NAME}/mkspecs/modules"
FILES_${PN}-dev += "${libdir}/${QT_DIR_NAME}/mkspecs"
