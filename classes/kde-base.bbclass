DEPENDS:prepend:class-nativesdk = "nativesdk-qtbase "
DEPENDS:prepend:class-target = "qtbase "
# Do not pin hard for extra-cmake-modules itself
DEPENDS += "extra-cmake-modules-native "

KDE_MIRROR = "http://download.kde.org"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/src/${BPN}-${PV}.tar.xz"

# extra-cmake-modules cause dependent to check for python
inherit cmake_qt5_extra pkgconfig python3native

DEPENDS += "libxml2-native"

do_compile:prepend() {
    export XDG_DATA_HOME=${STAGING_DATADIR}
}

FILES:${PN} += " \
    ${datadir}/kf5 \
    ${datadir}/qlogging-categories5 \
    ${libdir}/plugins/kf5 \
    ${libexecdir}/kf5 \
"

EXTRA_OECMAKE += " \
    -DECM_MKSPECS_INSTALL_DIR=${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs/modules \
    -DCMAKE_INSTALL_DATADIR=share \
    -DCMAKE_INSTALL_DBUSINTERFACEDIR=share/dbus-1/interfaces \
    -DKDE_INSTALL_QTPLUGINDIR=${OE_QMAKE_PATH_PLUGINS} \
    -DKDE_INSTALL_QMLDIR=${OE_QMAKE_PATH_QML} \
    -DKDE_PATH_EXTERNAL_HOST_LIBEXECS=${STAGING_LIBEXECDIR_NATIVE} \
    -DKDE_PATH_EXTERNAL_HOST_BINS=${STAGING_BINDIR_NATIVE} \
"

FILES:${PN} += " \
    ${datadir}/appdata \
    ${datadir}/metainfo \
"

FILES:${PN}-dev += "${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs"
