SUMMARY = "Baloo provides searching and indexing infrastucture with an emphasis on files"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 cmake_auto_align_paths cmake_lib gtk-icon-cache

DEPENDS += " \
    ki18n \
    kconfig \
    kconfig-native \
    kidletime \
    kauth \
    kauth-native \
    kcrash \
    solid \
    kio \
    kdbusaddons \
    kitemmodels \
    kfilemetadata \
    kcoreaddons-native \
    \
    xapian-core \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ef7918c5ff090508ae79908706d1ca58"
SRC_URI[sha256sum] = "d78a17895b212eb3d081990393787a6687fddc8f1be0de26149f608f0b37bf24"

SRC_URI += " \
    file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch \
    file://0002-do-not-create-dbus-xml-for-fileindexer-our-native-qd.patch \
    file://org.kde.baloo.fileindexer.xml \
"

do_configure_append() {
    # workaround broken native qdbuscpp2xml [1]. As long as this is necessary,
    # org.kde.baloo.fileindexer.xml must be created for each new version of baloo by:
    # 1. remove 0002-do-not-create-dbus-xml-for-fileindexer-our-native-qd.patch and do_configure_append
    # 2. Build baloo - if it crashes continue with 3.
    # 3. search log.do.compile for org.kde.baloo.fileindexer.xml and align command so that
    #    the file is created by host qdbuscpp2xml(-qt5)
    # 4. copy the file created to files
    mkdir -p ${B}/src/dbus
    cp -f ${WORKDIR}/org.kde.baloo.fileindexer.xml ${B}/src/dbus
}

CMAKE_ALIGN_SYSROOT[1] = "KF5Baloo, -S${libdir}, -s${OE_QMAKE_PATH_HOST_LIBS}"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/icons \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_QML}/org/kde/baloo \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${libdir}/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/baloo/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/baloo/experimental/.debug/ \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
