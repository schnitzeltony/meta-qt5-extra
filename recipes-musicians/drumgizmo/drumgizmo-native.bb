require ${BPN}.inc

inherit native

do_compile() {
     ${CXX} ${CXXFLAGS} -o ${S}/drumgizmo-rcgen ${S}/plugingui/rcgen.cc $(LDFLAGS)
}

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}/drumgizmo-rcgen ${D}${bindir}
}
