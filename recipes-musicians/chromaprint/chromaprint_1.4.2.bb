SUMMARY = "Chromaprint is library that extracts fingerprints from audio sources"
HOMEPAGE = "https://acoustid.org/chromaprint"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=5d50f7a9fde1110fa1756b0f5faa26f2"

inherit cmake

DEPENDS += " \
    fftw \
    ffmpeg \
"

EXTRA_OECMAKE += " \
    ${@bb.utils.contains('TUNE_FEATURES', 'neon', '-DFFT_LIB=fftw3f', '', d)} \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"

SRC_URI = "https://bitbucket.org/acoustid/${BPN}/downloads/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "895c42ba6d769840a2e10e507ad9f14d"
SRC_URI[sha256sum] = "989609a7e841dd75b34ee793bd1d049ce99a8f0d444b3cea39d57c3e5d26b4d4"
