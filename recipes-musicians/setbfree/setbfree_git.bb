SUMMARY = "A DSP Tonewheel Organ emulator"
HOMEPAGE = "http://setbfree.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit pkgconfig gtk-icon-cache

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
    file://setbfree.desktop \
    file://x42-whirl.desktop \
"
SRCREV = "9a4783cd91739d5ead118227bfeaaa651b0def5f"
S = "${WORKDIR}/git"
PV = "0.8.8"

EXTRA_OEMAKE += " \
    STRIP=echo \
    FONTFILE=${prefix}/share/fonts/ttf/VeraBd.ttf \
"

do_install() {
    oe_runmake 'DESTDIR=${D}' PREFIX=${prefix} lv2dir=${libdir}/lv2 install

    install -d  ${D}${datadir}/pixmaps
    install -m 0644 ${S}/doc/setBfree.png ${D}${datadir}/pixmaps
    install -m 0644 ${S}/doc/x42-whirl.png ${D}${datadir}/pixmaps

    install -d  ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/setbfree.desktop ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/x42-whirl.desktop ${D}${datadir}/applications
}

FILES_${PN} += " \
    ${datadir}/setBfree \
    ${libdir}/lv2 \
"

RDEPENDS_${PN} += "ttf-bitstream-vera"
