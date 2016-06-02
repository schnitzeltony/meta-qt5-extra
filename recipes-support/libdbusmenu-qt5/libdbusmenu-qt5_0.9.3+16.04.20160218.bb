SUMMARY = "A library that provides a Qt implementation of the DBusMenu spec"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=db979804f025cf55aabec7129cb671ed"
DEPENDS = "qtbase dbus"

SRC_URI = "http://archive.ubuntu.com/ubuntu/pool/main/libd/libdbusmenu-qt/libdbusmenu-qt_${PV}.orig.tar.gz"
SRC_URI[md5sum] = "8b90312bd8654e026d814d4db986ce5e"
SRC_URI[sha256sum] = "a8e6358a31c44ccdf1bfc46c95a77a6bfc7fc1f536aadb913ed4f4405c570cf6"

inherit cmake_qt5 cmake-lib cmake-extra-sanity

S = "${WORKDIR}/libdbusmenu-qt-${PV}"

EXTRA_OECMAKE += " \
    -DUSE_QT5=On \
    -DWITH_DOC=OFF \
"

do_install_append() {
    # HACK: make others find my headers (on target) - in sysroot class cmake-lib takes care
    sed -i 's:${PACKAGE_PREFIX_DIR}:${prefix}:g' ${D}/${libdir}/cmake/dbusmenu-qt5/dbusmenu-qt5-config.cmake
    sed -i 's:${_IMPORT_PREFIX}:${prefix}:g' ${D}/${libdir}/cmake/dbusmenu-qt5/dbusmenu-qt5-targets.cmake
}

FILES_${PN}-dev += "${libdir}/cmake"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "dbusmenu-qt5, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "dbusmenu-qt5, -S${includedir}, -S${STAGING_INCDIR}"
