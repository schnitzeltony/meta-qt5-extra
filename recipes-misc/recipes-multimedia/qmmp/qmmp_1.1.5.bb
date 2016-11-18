SUMMARY = "Qt5 based audio-player"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += " \
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
SRC_URI[md5sum] = "2e2bc8fbeac43a72a9b53b9ca615a9be"
SRC_URI[sha256sum] = "9b1288f432799980a5d58d131b56b4b590055d7e66c5fe50e9199b9daa35ddbd"

inherit cmake_qt5

FILES_${PN} += "${datadir}"

FILES_${PN}-dbg += " \
    ${libdir}/qmmp/*/.debug \
"
