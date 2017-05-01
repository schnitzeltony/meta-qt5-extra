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
SRC_URI[md5sum] = "b85b6901a66d3af28b9abfa577156c41"
SRC_URI[sha256sum] = "17bc88d00ea0753e6fc7273592e894320f05cae807f7cc2c6a5351c73217f010"

inherit cmake_qt5

FILES_${PN} += "${datadir}"

FILES_${PN}-dbg += " \
    ${libdir}/qmmp/*/.debug \
"
