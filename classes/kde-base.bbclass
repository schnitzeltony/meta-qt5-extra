DEPENDS += "qtbase extra-cmake-modules-native"

KDE_MIRROR = "http://download.kde.org"

MIRRORS += "\
${KDE_MIRROR}	http://ftp-stud.fht-esslingen.de/Mirrors/ftp.kde.org/pub/kde \n \
${KDE_MIRROR}	http://mirrors.mit.edu/kde \n \
${KDE_MIRROR}	http://mirror.cc.columbia.edu/pub/software/kde \n \
${KDE_MIRROR}	http://ftp.is.co.za/mirror/ftp.kde.org \n \
${KDE_MIRROR}	http://mirror.squ.edu.om/kde \n \
${KDE_MIRROR}	http://ftp.fi.muni.cz/pub/kde \n \
${KDE_MIRROR}	http://mirrors.fe.up.pt/pub/kde \n \
${KDE_MIRROR}	http://mirror.its.dal.ca/kde \n \
${KDE_MIRROR}	http://kde.c3sl.ufpr.br \n \
"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/src/${BPN}-${PV}.tar.xz"

# extra-cmake-modules cause dependent to check for python
inherit cmake_qt5_extra pythonnative

DEPENDS += "libxml2-native"

do_compile_prepend() {
    export XDG_DATA_HOME=${STAGING_DATADIR}
}

FILES_${PN} += "${libdir}/plugins/kf5 ${datadir}/kf5 ${libexecdir}/kf5"

EXTRA_OECMAKE += " \
    -DECM_MKSPECS_INSTALL_DIR=${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs/modules \
    -DCMAKE_INSTALL_DATADIR=share \
    -DCMAKE_INSTALL_DBUSINTERFACEDIR=share/dbus-1/interfaces \
    -DKDE_INSTALL_QTPLUGINDIR=${OE_QMAKE_PATH_PLUGINS} \
    -DKDE_INSTALL_QMLDIR=${OE_QMAKE_PATH_QML} \
    -DKDE_PATH_EXTERNAL_HOST_LIBEXECS=${STAGING_LIBEXECDIR_NATIVE} \
    -DKDE_PATH_EXTERNAL_HOST_BINS=${STAGING_BINDIR_NATIVE} \
"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/metainfo \
"

FILES_${PN}-dev += "${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs"
