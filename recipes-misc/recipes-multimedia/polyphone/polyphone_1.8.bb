SUMMARY = "Soundfont editor"
HOMEPAGE = "http://polyphone-soundfonts.com/en/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://main.cpp;beginline=6;endline=18;md5=092eabd5b12b1c1d876a94e06601bd81"

inherit qmake5 gtk-icon-cache mime

DEPENDS += " \
    qtbase \
    qtsvg \
    alsa-lib \
    jack \
    portaudio-v19 \
    rtmidi \
    qcustomplot \
    stk \
    libvorbis \
    libogg \
"

SRC_URI = " \
    http://polyphone-soundfonts.com/en/download/file/76-polyphone-1-8-src-zip/latest/download;downloadfilename=polyphone-1-8-src.zip \
    file://polyphone.desktop \
    file://polyphone.mime \
    file://0001-align-compiler-switches-constants-for-cross-compilin.patch \
"
SRC_URI[md5sum] = "75ec14ab98bcf80f360debd80c553733"
SRC_URI[sha256sum] = "2b0ba2887646208ae9953a336adfebe460133cd403e76f7fe795d3071827dfdd"

S = "${WORKDIR}/trunk"

do_configure_prepend() {
    sed -i 's:= /usr/include:= ${STAGING_INCDIR}:g' ${S}/polyphone.pro
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/RELEASE/polyphone ${D}${bindir}/

    install -d ${D}${datadir}/pixmaps
    install -m 0644 ${S}/ressources/polyphone.png ${D}${datadir}/pixmaps/

    install -d ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/${BPN}.desktop ${D}${datadir}/applications/

    install -d ${D}${datadir}/mime/packages
	install -m 0644 ${WORKDIR}/${BPN}.mime ${D}${datadir}/mime/packages/${BPN}.xml
}

FILES_${PN} += " \
    ${datadir}/mime \
"

