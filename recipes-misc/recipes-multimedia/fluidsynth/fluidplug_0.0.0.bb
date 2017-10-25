SUMMARY = "FluidPlug - SoundFonts as LV2 plugins via FluidSynth"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://source/FluidPlug.c;beginline=5;endline=15;md5=4932c97445ed4b8b2ce1203706e06a49"

inherit pkgconfig

DEPENDS += " \
    lv2 \
    fluidsynth \
"

SRC_URI = " \
    git://github.com/falkTX/FluidPlug.git \
    file://0001-Makefile.mk-don-t-strip-binaries.patch \
"
SRCREV = "889b2568f5c4483b1c72b5d82e4090e27ef824de"
S = "${WORKDIR}/git"

do_compile[depends] += "p7zip-native:do_populate_sysroot"

do_compile_prepend() {
    export NOOPT=true
}

do_install() {
    oe_runmake DESTDIR=${D} PREFIX=${prefix} install
    install -d ${D}${datadir}/sf2
    cd ${S}
    for file in `find -name '*.lv2'`; do
        file=`basename $file`
        sf2name=`echo $file | sed -e 's#lv2#sf2##'`
        ln -sf  ${libdir}/lv2/$file/FluidPlug.sf2 ${D}${datadir}/sf2/$sf2name
    done
}

FILES_${PN} += " \
    ${datadir}/sf2 \
    ${libdir}/lv2 \
"
