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
    enca \
"

SRC_URI = " \
    http://qmmp.ylsoftware.com/files/${BPN}-${PV}.tar.bz2 \
    file://0001-Remove-freebsd-compilation-support.patch \
"
SRC_URI[md5sum] = "cc3468fe610412e2db5113d8ce0a379e"
SRC_URI[sha256sum] = "8020c92e5dd75ed9ab34fd5d1bb524e01f2f361dafd2fe9a3073ae97f5896c9e"

inherit cmake_qt5

FILES_${PN} += "${datadir}"

FILES_${PN}-dbg += " \
    ${libdir}/qmmp/*/.debug \
"
