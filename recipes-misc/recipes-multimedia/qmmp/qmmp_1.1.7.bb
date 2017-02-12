SUMMARY = "Qt5 based audio-player"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += " \
    qttools-native \
    qtbase \
    qtmultimedia \
    ffmpeg \
    libsamplerate0 \
    curl \
    qtx11extras \
    taglib \
    libcdio \
    libcdio-paranoia \
    libcddb \
    libmad \
    faad2 \
    wavpack \
    libmms \
    libmodplug \
    libvorbis \
    projectm \
"

SRC_URI = " \
    http://qmmp.ylsoftware.com/files/${BPN}-${PV}.tar.bz2 \
    file://0001-Remove-freebsd-compilation-support.patch \
"
SRC_URI[md5sum] = "bf31726a9039bc22853ad4cc9d32b152"
SRC_URI[sha256sum] = "464f79d9a54e6456c5abcb570d7f062e48d3eaa3d60ad2b09c58bc62af5b87a7"

inherit cmake_qt5

FILES_${PN} += "${datadir}"

FILES_${PN}-dbg += " \
    ${libdir}/qmmp/*/.debug \
"
