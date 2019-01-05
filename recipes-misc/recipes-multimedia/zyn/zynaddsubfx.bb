require zyn.inc

SUMMARY = "ZynAddSubFX is an open source software synthesizer"

DEPENDS += " \
    ntk-native ntk \
    fltk-native fltk \
"

do_compile_append() {
    # Build Controller/Spliter
    oe_runmake -C ${S}/ExternalPrograms/Controller
    oe_runmake -C ${S}/ExternalPrograms/Spliter
}

do_install_append() {
    install -m 0755 ${S}/ExternalPrograms/Controller/controller ${D}${bindir}/zynaddsubfx-controller
    install -m 0755 ${S}/ExternalPrograms/Spliter/spliter ${D}${bindir}/zynaddsubfx-spliter
}

RREPLACES_${PN} += "zyn-fusion"
RCONFLICTS_${PN} += "zyn-fusion"
