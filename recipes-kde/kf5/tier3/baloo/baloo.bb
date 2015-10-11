SUMMARY = "Baloo provides searching and indexing infrastucture with an emphasis on files"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 cmake-lib cmake-auto-align-paths

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
SRC_URI[md5sum] = "25177cb45b803baab1bfbf36e63fd396"
SRC_URI[sha256sum] = "7fdd56331e7fbf939d18a20d706e9e1299f929ae79b55ddd531c51f825ed1c83"

SRC_URI += " \
    file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch \
    file://0002-Baloo.pc.cmake-fix-paths-for-Libs-and-Cflags.patch \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Baloo, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Baloo, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir} \
    ${libdir}/kauth \
    ${OE_QMAKE_PATH_QML}/org/kde/baloo \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${libdir}/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/baloo/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
