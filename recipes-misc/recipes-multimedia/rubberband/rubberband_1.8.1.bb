SUMMARY = "Rubber Band Library library for audio time-stretching and pitch-shifting"
HOMEPAGE = "http://breakfastquay.com/rubberband/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit autotools-brokensep pkgconfig

DEPENDS += " \
    fftw \
    libsamplerate0 \
    vamp-plugin-sdk \
    ladspa-sdk \
"

SRC_URI = "http://code.breakfastquay.com/attachments/download/34/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "6c2b4e18a714bcc297d0db81a10f9348"
SRC_URI[sha256sum] = "ff0c63b0b5ce41f937a8a3bc560f27918c5fe0b90c6bc1cb70829b86ada82b75"

FILES_${PN} += " \
    ${datadir}/ladspa \
    ${libdir}/ladspa \
    ${libdir}/vamp \
"
