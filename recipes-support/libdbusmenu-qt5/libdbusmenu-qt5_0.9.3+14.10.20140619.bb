SUMMARY = "dbusmenu library for Qt5"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=db979804f025cf55aabec7129cb671ed"
DEPENDS = "qtbase dbus"

SRC_URI = "http://archive.ubuntu.com/ubuntu/pool/main/libd/libdbusmenu-qt/libdbusmenu-qt_${PV}.orig.tar.gz"
SRC_URI[md5sum] = "aba34b9b91f18d60828ca1143bf23b0b"
SRC_URI[sha256sum] = "e531b29388317f48e22c652c7111e9c7750aa7d429a72742c49a1c8af1e61968"

inherit cmake_qt5 cmake-lib

S = "${WORKDIR}/libdbusmenu-qt-${PV}"

EXTRA_OECMAKE += "-DUSE_QT5=On"

FILES_${PN}-dev += "${libdir}/cmake"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "dbusmenu-qt5, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
