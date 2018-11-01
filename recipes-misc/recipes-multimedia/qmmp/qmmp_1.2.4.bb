SUMMARY = "Qt5 based audio-player"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

# Note: to support projectm, qtbase must be configured with desktop gl / gles
# won't work

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
    jack \
    soxr \
"

SRC_URI = " \
    http://qmmp.ylsoftware.com/files/${BPN}-${PV}.tar.bz2 \
    file://0001-Remove-freebsd-compilation-support.patch \
    file://0002-Hardcode-projectM-configuration-file-location.patch \
"
SRC_URI[md5sum] = "70bddb784419996383ce3876a48bd62b"
SRC_URI[sha256sum] = "224904f073e3921a080dca008e6c99e3d606f5442d1df08835cba000a069ae66"

inherit cmake_qt5

FILES_${PN} += "${datadir}"
