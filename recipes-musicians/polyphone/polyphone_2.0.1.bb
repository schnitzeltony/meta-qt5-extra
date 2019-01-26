SUMMARY = "Soundfont editor"
HOMEPAGE = "http://polyphone-soundfonts.com/en/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://main.cpp;beginline=6;endline=18;md5=11e8b245e7c8a15dafd52bc856ef3ff1"

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
    git://github.com/davy7125/polyphone.git \
    file://polyphone.desktop \
    file://polyphone.mime \
    file://0001-align-compiler-switches-constants-for-cross-compilin.patch \
"
SRCREV = "9f9720f4fded286f253e85fc708ee9bbba507eb5"
S = "${WORKDIR}/git/sources"

do_configure_prepend() {
    sed -i \
        -e 's:= /usr/include:= ${STAGING_INCDIR}:g' \
        -e 's:^DEFINES += USE_LOCAL_:#DEFINES += USE_LOCAL_:g' \
        ${S}/polyphone.pro
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/bin/polyphone ${D}${bindir}/

    install -d ${D}${datadir}/pixmaps
    install -m 0644 ${S}/resources/polyphone.png ${D}${datadir}/pixmaps/

    install -d ${D}${datadir}/applications
    install -m 0644 ${WORKDIR}/${BPN}.desktop ${D}${datadir}/applications/

    install -d ${D}${datadir}/mime/packages
	install -m 0644 ${WORKDIR}/${BPN}.mime ${D}${datadir}/mime/packages/${BPN}.xml
}

FILES_${PN} += " \
    ${datadir}/mime \
"

