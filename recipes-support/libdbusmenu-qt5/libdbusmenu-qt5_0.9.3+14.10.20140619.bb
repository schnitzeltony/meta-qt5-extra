SUMMARY = "A library that provides a Qt implementation of the DBusMenu spec"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=db979804f025cf55aabec7129cb671ed"
DEPENDS = "qtbase dbus"

SRC_URI = "http://archive.ubuntu.com/ubuntu/pool/main/libd/libdbusmenu-qt/libdbusmenu-qt_${PV}.orig.tar.gz"
SRC_URI[md5sum] = "aba34b9b91f18d60828ca1143bf23b0b"
SRC_URI[sha256sum] = "e531b29388317f48e22c652c7111e9c7750aa7d429a72742c49a1c8af1e61968"

inherit cmake_qt5 cmake-lib cmake-extra-sanity

S = "${WORKDIR}/libdbusmenu-qt-${PV}"

EXTRA_OECMAKE += " \
    -DUSE_QT5=On \
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
