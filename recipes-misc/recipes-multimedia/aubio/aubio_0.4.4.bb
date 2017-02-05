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

SRC_URI = "https://aubio.org/pub/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "36870d6682716edc7977ca1d13c03bb4"
SRC_URI[sha256sum] = "2acdb92623b9d4ba641c387760ffe3ec1e4c6ab498e64e5e2286c99e36ffbff8"

EXTRA_OECONF = " \
    --notests \
    --prefix=${prefix} \
    --sysconfdir=${sysconfdir} \
    --libdir=${libdir} \
"

do_compile()  {
	${S}/waf build ${@get_waf_parallel_make(d)} --notests
}

do_install() {
	${S}/waf install --destdir=${D} --notests
}

