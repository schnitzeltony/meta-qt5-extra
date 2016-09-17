SUMMARY = "Chromaprint is library that extracts fingerprints from audio sources"
HOMEPAGE = "https://acoustid.org/chromaprint"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit cmake

DEPENDS += " \
    virtual/fftw \
"

SRC_URI = "https://bitbucket.org/acoustid/${BPN}/downloads/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cba6ed3209516518d2ecfda887dabdaf"
SRC_URI[sha256sum] = "c3af900d8e7a42afd74315b51b79ebd2e43bc66630b4ba585a54bf3160439652"

