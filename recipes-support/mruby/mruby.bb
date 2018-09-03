require ${BPN}.inc

DEPENDS += " \
    ${BPN}-native \
"

do_configure_prepend() {
    # find native mrbc
    sed -i 's:\#{mrbc_build.build_dir}/bin/mrbc:${STAGING_BINDIR_NATIVE}/mrbc:' ${S}/lib/mruby/build.rb
}

do_install_append() {
    # mruby-zest needs our staic libs
    install -d ${D}/${libdir}
    cp ${B}/build/host/lib/*.a ${D}/${libdir}
}

# REVISIT: Check build for big endian machines
