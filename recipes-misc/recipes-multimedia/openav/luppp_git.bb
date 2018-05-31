SUMMARY = "Luppp is a music creation tool, intended for live use"
HOMEPAGE = "http://openavproductions.com/luppp/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

inherit cmake pkgconfig gtk-icon-cache

DEPENDS = " \
    jack \
    cairo \
    liblo \
    libsndfile1 \
    libsamplerate0 \
    ntk \
"

SRC_URI = " \
    git://github.com/openAVproductions/openAV-Luppp.git \
    file://0001-CMake-Remove-arch-detection-it-detects-build-host.patch \
"
SRCREV = "289313ce132133d5d3c86724a1e3b488260d1728"
PV = "1.1.1+git${SRCPV}"
S = "${WORKDIR}/git"

do_install_append() {
    install -Dm 644 ${S}/resources/metadata/luppp.desktop ${D}${datadir}/applications/luppp.desktop
    install -Dm 644 ${S}/resources/icons/luppp.svg ${D}/${datadir}/icons/hicolor/scalable/apps/luppp.svg
    install -d ${D}/${datadir}/${BPN}/controllers
    for ctlr in `find ${S}/resources/controllers -name *ctlr`; do
        install -m 644 $ctlr ${D}/${datadir}/${BPN}/controllers/
    done
}

RDEPENDS_${PN} += "hicolor-icon-theme"
