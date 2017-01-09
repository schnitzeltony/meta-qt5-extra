require ${BPN}.inc

inherit autotools-brokensep pkgconfig gtk-icon-cache bash-completion

DEPENDS += " \
    ${BPN}-native \
    gtk+ \
    jack \
    fluidsynth \
    liblo \
    ladspa-sdk \
"

SRC_URI += "file://0003-don-not-build-cross-calfmakerdf.patch"

EXTRA_OECONF += "--enable-experimental"

do_compile_append() {
    # we need native calfmakerdf at the position where the build expects it so
    # link it there
    ln -s ${STAGING_BINDIR_NATIVE}/calfmakerdf ${B}/src/calfmakerdf
}

FILES_${PN} += "${libdir}/lv2"
INSANE_SKIP_${PN} = "dev-so"

# TBD: SSE -> NEON
