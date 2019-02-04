SUMMARY = "Chromaprint is library that extracts fingerprints from audio sources"
HOMEPAGE = "https://acoustid.org/chromaprint"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=5d50f7a9fde1110fa1756b0f5faa26f2"

inherit cmake

DEPENDS += " \
    fftw \
    ffmpeg \
"


SRC_URI = "git://github.com/acoustid/chromaprint.git"
SRCREV = "ecd2edd73315530d4f9c1b1186aee24c63a7b6c2"
PV = "1.4.3"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    ${@bb.utils.contains('TUNE_FEATURES', 'neon', '-DFFT_LIB=fftw3f', '', d)} \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"
