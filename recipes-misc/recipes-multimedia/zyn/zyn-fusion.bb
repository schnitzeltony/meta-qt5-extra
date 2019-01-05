require zyn.inc

SUMMARY = "Zyn-Fusion is an open source software synthesizer"

EXTRA_OECMAKE += "-DGuiModule=zest"

FILES_${PN} += " \
    ${datadir}/zynaddsubfx \
"

RDEPENDS_${PN} += "mruby-zest"

RREPLACES_${PN} += "zynaddsubfx"
RCONFLICTS_${PN} += "zynaddsubfx"
