SUMMARY = "aubio is designed for the extraction of annotations from audio signals"
HOMEPAGE = "https://aubio.org/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit waf pkgconfig

DEPENDS += " \
    jack \
    ffmpeg \
    libsndfile1 \
    libsamplerate0 \
    python3-numpy \
"

SRC_URI = " \
    https://aubio.org/pub/${BPN}-${PV}.tar.bz2 \
    file://0001-do-not-build-tests.patch \
"
SRC_URI[md5sum] = "1e8deb14b0e45ffadc91dcf7cfaee0c8"
SRC_URI[sha256sum] = "cbed4afec5ab3a1a6300c7e3af0a1369379aa94259f5e701a8ca905cdd9fa041"

EXTRA_OECONF = " \
    --prefix=${prefix} \
    --sysconfdir=${sysconfdir} \
    --libdir=${libdir} \
"
