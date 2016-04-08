SUMMARY = "QtGStreamer is a set of libraries providing C++ bindings for GStreamer"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit cmake_qt5  cmake-lib

DEPENDS += " \
    qtbase \
    qtdeclarative \
    glib-2.0 \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
"

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/${BPN}/${BPN}-${PV}.tar.xz \
    file://0001-Fix-compilation-with-GStreamer-1-5-1.patch \
"
SRC_URI[md5sum] = "fd794045a828c184acc1794b08a463fd"
SRC_URI[sha256sum] = "9f3b492b74cad9be918e4c4db96df48dab9c012f2ae5667f438b64a4d92e8fd4"

EXTRA_OECMAKE += " \
    -DQT_VERSION=5 \
    -DUSE_QT_PLUGIN_DIR=OFF \
"

FILES_${PN} += " \
    ${libdir}/gstreamer-1.0 \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dev += " \
    ${libdir}/cmake \
"

CMAKE_ALIGN_SYSROOT[1] = "Qt5GStreamer, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
