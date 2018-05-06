SUMMARY = "Commandline tools for soundfont analysis and split"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = " \
    file://README;beginline=119;endline=121;md5=6c1c96772982f45a0c0deca5af1b988d \
"
SRC_URI = "git://github.com/schnitzeltony/iffdigest.git"
SRCREV = "90d073dd35206f2cb9804f8e65600d7661cc5dcb"
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
