require ${BPN}.inc

inherit native

do_compile() {
    ${CXX} -o embedresources src/toolkits/embedresources.cpp
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/embedresources ${D}${bindir}/
}
