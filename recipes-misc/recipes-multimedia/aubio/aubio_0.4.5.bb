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
SRC_URI[md5sum] = "6d9e361b2f4bb7ed97d1b649dca5e9d4"
SRC_URI[sha256sum] = "70c2804e6f4fbf0ebc0fb9ac8cc9d465ef4a4d438311c074c9a7364e98827af6"

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

