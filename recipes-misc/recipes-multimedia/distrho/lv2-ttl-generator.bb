SUMMARY = "lv2-ttl-generator-native"
LICENSE = "ISC"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=7b4d7947003bd60e5475fc61c6d014da \
"

SRC_URI = "git://github.com/DISTRHO/DPF.git"
SRCREV = "70cec6a9d0222b32abdcaec02cd7b01378c4d78b"
S = "${WORKDIR}/git"
PV = "0.0.0+git${SRCPV}"

BBCLASSEXTEND = "native"

do_compile() {
    cd ${S}/utils/lv2-ttl-generator
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/utils/lv2_ttl_generator ${D}${bindir}/lv2-ttl-generator
}
