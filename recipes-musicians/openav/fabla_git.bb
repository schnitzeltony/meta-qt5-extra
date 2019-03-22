SUMMARY = "Fabla is an open-source LV2 drum sampler plugin instrument"
HOMEPAGE = "http://openavproductions.com/fabla/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4cc91856b08b094b4f406a29dc61db21"

inherit cmake pkgconfig

DEPENDS = " \
    ntk \
    cairo \
    cairomm \
    libsndfile1 \
    lv2 \
"

SRC_URI = " \
    git://github.com/openAVproductions/openAV-Fabla.git \
    file://0001-Do-not-overwrite-build-flags-it-causes-trouble-for-m.patch \
"
SRCREV = "05bb8d4704a601e660dcd146caf5899d4a4cc5cc"
S = "${WORKDIR}/git"
PV = "1.3.2+git${SRCPV}"

FILES_${PN} += " \
    ${libdir}/lv2 \
"
