SUMMARY = "Qt5 based audio-player"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += " \
    qtbase \
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
SRC_URI[md5sum] = "045e982fb7bed9d0ac37f5113a2be254"
SRC_URI[sha256sum] = "419913e6becc91061a361afaf59b3471cfb6d28dcca1fb6201f4155632b4ad02"

inherit cmake_qt5

FILES_${PN} += "${datadir}"
