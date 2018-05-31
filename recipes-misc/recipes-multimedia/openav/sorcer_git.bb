SUMMARY = "Sorcer is a polyphonic wavetable synth LV2 plugin"
HOMEPAGE = "http://openavproductions.com/sorcer"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

inherit cmake pkgconfig

DEPENDS = " \
    boost \
    cairo \
    lv2 \
    ntk \
"

SRC_URI = " \
    git://github.com/openAVproductions/openAV-Sorcer.git \
    file://0001-Do-not-overwrite-build-flags-it-causes-trouble-for-m.patch \
"
SRCREV = "0a8cef484174aae5c1b7be6710f31a643e7d7197"
PV = "1.1.3+git${SRCPV}"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${libdir}/lv2 \
"
