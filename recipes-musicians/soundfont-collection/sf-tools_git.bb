SUMMARY = "Commandline tools for soundfont analysis and split"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=75859989545e37968a99b631ef42722e \
"
SRC_URI = "git://github.com/schnitzeltony/soundfont-cmdline-tools.git"
SRCREV = "c4b11144dc714d9e4d959f0631c35a6b9764c057"
S = "${WORKDIR}/git"
PV = "0.0.0+git${SRCPV}"

BBCLASSEXTEND = "native"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/sf2-test ${D}${bindir}/
    install -m 0755 ${S}/sf2-split ${D}${bindir}/
}
