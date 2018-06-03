SUMMARY = "A DSP Tonewheel Organ emulator"
HOMEPAGE = "http://setbfree.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit autotools-brokensep pkgconfig gtk-icon-cache

DEPENDS += " \
    virtual/libgl \
    pango \
    cairo \
    libglu \
    ftgl \
    jack \
    liblo \
    lv2 \
    zita-convolver \
    libsndfile1 \
"

SRC_URI = " \
    git://github.com/pantherb/setBfree.git \
    file://0001-remove-UINQHACK-it-is-used-for-OSX-builds-only-and-c.patch \
    file://0002-Do-not-check-for-fontfile.patch \
"
SRCREV = "ff2ea498f74671ce1051cec1738d9f3c71da8bec"
S = "${WORKDIR}/git"
PV = "0.8.5+git${SRCPV}"

EXTRA_OEMAKE += " \
    PREFIX=${prefix} \
    STRIP=echo \
    FONTFILE=${prefix}/share/fonts/ttf/VeraBd.ttf \
"

do_install_append() {
    install -d  ${D}${datadir}/pixmaps
    install -m 0644 ${S}/doc/setBfree.png ${D}${datadir}/pixmaps
    install -m 0644 ${S}/doc/x42-whirl.png ${D}${datadir}/pixmaps

    install -d  ${D}${datadir}/applications
    install -m 0644 ${S}/debian/setbfree.desktop ${D}${datadir}/applications
    install -m 0644 ${S}/debian/x42-whirl.desktop ${D}${datadir}/applications
}

FILES_${PN} += " \
    ${datadir}/setBfree \
    ${libdir}/lv2 \
"

RDEPENDS_${PN} += "ttf-bitstream-vera"
