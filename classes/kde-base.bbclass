DEPENDS += "qtbase extra-cmake-modules-native"

KDE_BRANCH ?= "master"

# default git
SRC_URI = "git://anongit.kde.org/${BPN};protocol=git;branch=${KDE_BRANCH}"

# extra-cmake-modules cause dependent to check for python
inherit cmake_qt5 pythonnative

FILES_${PN} += "${libdir}/plugins/kf5 ${datadir}/kf5"
FILES_${PN}-dev += "${libdir}/cmake"
FILES_${PN}-dbg += "${libdir}/plugins/kf5/.debug"

EXTRA_OECMAKE += " \
    -DECM_MKSPECS_INSTALL_DIR=${libdir}/${QT_DIR_NAME}/mkspecs/modules \
    -DCMAKE_INSTALL_DATADIR=share \
    -DCMAKE_INSTALL_DBUSINTERFACEDIR=share/dbus-1/interfaces \
"
FILES_${PN}-dev += "${libdir}/${QT_DIR_NAME}/mkspecs"
