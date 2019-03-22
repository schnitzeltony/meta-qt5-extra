SUMMARY = "Audio plugins in the LV2 format"
HOMEPAGE = "http://ssj71.github.io/infamousPlugins/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS += " \
    cairo \
    lv2 \
    ntk ntk-native \
    zita-resampler \
    fftw \
"

inherit cmake pkgconfig gtk-icon-cache

SRC_URI = " \
    git://github.com/ssj71/infamousPlugins.git \
"
SRCREV = "970a5de32393cc92ab2144d6a8a5e92b302dc9b5"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DLIBDIR=${baselib} \
"

FILES_${PN} += "${libdir}/lv2"
