require ${BPN}.inc

DEPENDS += " \
   ${BPN}-native \
   gtk+ \
   alsa-lib \
   jack \
"

inherit autotools pkgconfig

SRC_URI += " \
    file://timidity.desktop \
    file://0001-do-not-run-check-for-va_copy-this-is-not-allowed-in-.patch \
    file://0002-find-cross-calcnewt.patch \
"

# maybe add further on --enable-audio later
EXTRA_OECONF += " \
    --disable-alsatest \
    --enable-audio=alsa,jack \
    --with-module-dir=${libdir}/${BPN} \
    --enable-dynamic=gtk \
    --enable-alsaseq \
"

CFLAGS  += '-DCONFIG_FILE=\\"${sysconfdir}/timidity++.cfg\\"'

do_configure_prepend() {
    export SHLDFLAGS="${LDFLAGS}"
}

do_install_append() {
	install -d ${D}/${datadir}/applications
	install ${WORKDIR}/timidity.desktop ${D}/${datadir}/applications

    # timidity++ needs at least an empty file
    install -d ${D}/${sysconfdir}
    touch ${D}/${sysconfdir}/timidity++.cfg
}
