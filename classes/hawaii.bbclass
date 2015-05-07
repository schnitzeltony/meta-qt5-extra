SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git"

DEPENDS += "qtbase qtdeclarative qtquickcontrols extra-cmake-modules-native"

inherit cmake_qt5

EXTRA_OECMAKE += " \
    -DQML_INSTALL_DIR=${OE_QMAKE_PATH_QML} \
"
