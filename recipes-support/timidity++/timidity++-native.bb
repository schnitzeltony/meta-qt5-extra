require ${BPN}.inc

inherit native

B = "${WORKDIR}/build"

do_configure() {
    mkdir -p ${B}
    cp -f ${S}/timidity/calcnewt.c ${B}
}

do_compile() {
    cd ${B}
    ${CC} -o calcnewt calcnewt.c -lm
}

do_install() {
    install -d ${D}${bindir}
    install ${B}/calcnewt ${D}${bindir}
}
