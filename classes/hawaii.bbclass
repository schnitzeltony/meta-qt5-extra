SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git"

DEPENDS += "qtbase qtdeclarative qtquickcontrols extra-cmake-modules-native"

inherit cmake_qt5 cmake_extra_sanity pkgconfig

EXTRA_OECMAKE += " \
    -DQML_INSTALL_DIR=${OE_QMAKE_PATH_QML} \
    -DECM_MKSPECS_INSTALL_DIR=${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs/modules \
    -DPLUGIN_INSTALL_DIR=${OE_QMAKE_PATH_PLUGINS} \
    -DQT_PLUGIN_INSTALL_DIR=${OE_QMAKE_PATH_PLUGINS} \
"
