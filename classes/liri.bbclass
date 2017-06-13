LIRI_GIT_BRANCH ?= "develop"

SRC_URI = "git://github.com/lirios/${@'${BPN}'.replace('liri-', '')}.git;protocol=git;branch=${LIRI_GIT_BRANCH}"

DEPENDS += "qtbase qtdeclarative extra-cmake-modules-native"

inherit cmake_qt5_extra pkgconfig

EXTRA_OECMAKE += " \
    -DQML_INSTALL_DIR=${OE_QMAKE_PATH_QML} \
    -DECM_MKSPECS_INSTALL_DIR=${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs/modules \
    -DPLUGIN_INSTALL_DIR=${OE_QMAKE_PATH_PLUGINS} \
    -DQT_PLUGIN_INSTALL_DIR=${OE_QMAKE_PATH_PLUGINS} \
"
