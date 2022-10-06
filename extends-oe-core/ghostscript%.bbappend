DEPENDS:append:class-target = " libidn"

EXTRA_OECONF:remove:class-target = "--without-libidn"

do_configure:append:class-target() {
    # more (so) copy tools from the native ghostscript build
    mkdir -p soobj/aux
    for i in genarch genconf mkromfs echogs gendev genht packps; do
        cp -f ${STAGING_BINDIR_NATIVE}/ghostscript-${PV}/$i soobj/aux/$i
    done
}

do_compile:class-target() {
    oe_runmake so
}

do_install:class-target() {
    oe_runmake 'DESTDIR=${D}' soinstall
    mv -f ${D}${bindir}/gsc ${D}${bindir}/gs
}
