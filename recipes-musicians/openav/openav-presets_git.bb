SUMMARY = "Presets for various OpenAV projects"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

inherit allarch

SRC_URI = " \
    git://github.com/harryhaaren/openAV-presets.git \
"
SRCREV = "c52ded5002b1bdf05bae3fe692b259a6b414942c"
PV = "0.0.0+git${SRCPV}"
S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${libdir}/lv2
    for lv2dir in `find ${S} -name '*.lv2' -maxdepth 1`; do
        lv2basedir=`basename $lv2dir`
        install -d ${D}${libdir}/lv2/$lv2basedir
        for lv2file in `find ${S}/$lv2basedir -mindepth 1 -maxdepth 1`; do
            install -m 644 $lv2file ${D}${libdir}/lv2/$lv2basedir
        done
    done
}

FILES_${PN} += " \
    ${libdir}/lv2 \
"
