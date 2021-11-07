LIRI_GIT_BRANCH ?= "develop"

SRC_URI = "git://github.com/lirios/${@'${BPN}'.replace('liri-', '')}.git;branch=${LIRI_GIT_BRANCH};protocol=https"

DEPENDS += " \
    qtwayland-native \
    qttools-native \
    liri-cmake-shared \
    extra-cmake-modules \
    qtbase \
    qttools \
    qtdeclarative \
    qtwayland \
"

inherit cmake_qt5_extra pkgconfig

EXTRA_OECMAKE += " \
    -DINSTALL_LIBDIR:PATH=${baselib} \
    -DINSTALL_QMLDIR:PATH=${OE_QMAKE_PATH_QML} \
    -DINSTALL_PLUGINSDIR:PATH=${OE_QMAKE_PATH_PLUGINS} \
"
