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
"

SRC_URI = " \
    http://qmmp.ylsoftware.com/files/${BPN}-${PV}.tar.bz2 \
    file://0001-Remove-freebsd-compilation-support.patch \
"
SRC_URI[md5sum] = "3b751d7864fdbe56e13566cd172b4bcb"
SRC_URI[sha256sum] = "8b48bd208506a9e98428480b1aa21daa96e3866b4cc3a11e8cb008ef564c13aa"

inherit cmake_qt5

FILES_${PN} += "${datadir}"

FILES_${PN}-dbg += " \
    ${libdir}/qmmp/*/.debug \
"
