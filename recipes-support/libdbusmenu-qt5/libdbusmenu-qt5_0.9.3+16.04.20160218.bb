SUMMARY = "A library that provides a Qt implementation of the DBusMenu spec"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=db979804f025cf55aabec7129cb671ed"
DEPENDS = "qtbase dbus"

SRC_URI = "http://archive.ubuntu.com/ubuntu/pool/main/libd/libdbusmenu-qt/libdbusmenu-qt_${PV}.orig.tar.gz"
SRC_URI[md5sum] = "8b90312bd8654e026d814d4db986ce5e"
SRC_URI[sha256sum] = "a8e6358a31c44ccdf1bfc46c95a77a6bfc7fc1f536aadb913ed4f4405c570cf6"

inherit cmake_qt5_extra

S = "${WORKDIR}/libdbusmenu-qt-${PV}"

EXTRA_OECMAKE += " \
    -DUSE_QT5=On \
    -DWITH_DOC=OFF \
"
