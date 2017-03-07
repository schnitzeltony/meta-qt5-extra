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
    kidletime \
    kauth \
    kcrash \
    solid \
    kio \
    kdbusaddons \
    kitemmodels \
    kfilemetadata \
    \
    xapian-core \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "831874cc5f6bf3aab76ca196d30995b3"
SRC_URI[sha256sum] = "7f399ba51dd85a01491755b36f5e46a32c6164a0bb2474651f33fef40ee66c58"

SRC_URI += " \
    file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch \
    file://0002-Workaround-build-error-for-Qt5.8-properly-working-qd.patch \
"

CMAKE_ALIGN_SYSROOT[1] = "KF5Baloo, -S${libdir}, -S${STAGING_LIBDIR}"

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
