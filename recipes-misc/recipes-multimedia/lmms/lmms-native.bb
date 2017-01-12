require ${BPN}.inc

inherit native

do_compile() {
    cd ${S}/buildtools
    ${CXX} ${CXXFLAGS} -o bin2res bin2res.cpp $(LDFLAGS)
}

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}/buildtools/bin2res ${D}${bindir}
}
