SUMMARY = "ArtyFX is a plugin bundle of artistic real-time audio effects"
HOMEPAGE = "http://openavproductions.com/artyfx/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4cc91856b08b094b4f406a29dc61db21"

inherit cmake pkgconfig

DEPENDS = " \
    virtual/libx11 \
    cairo \
    lv2 \
    libsndfile1 \
"

SRC_URI = " \
    https://github.com/openAVproductions/openAV-ArtyFX/archive/release-${PV}.zip \
    file://0001-Do-not-overwrite-build-flags-it-causes-trouble-for-m.patch \
    file://0002-avtk-remove-sse-flags-they-work-on-intel-hardware-on.patch \
"
SRC_URI[md5sum] = "b96dca48391188442609867f60edb702"
SRC_URI[sha256sum] = "5010cb190f5d507fd384325ee1f7f83b8441429e3b7f19b5287f1b6ea6b8f82c"

S = "${WORKDIR}/openAV-ArtyFX-release-${PV}"

EXTRA_OECMAKE += " \
    -DBUILD_SSE=OFF \
"

FILES_${PN} += " \
    ${libdir}/lv2 \
"
