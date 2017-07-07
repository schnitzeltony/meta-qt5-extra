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
}

FILES_${PN} += "${libdir}/lv2"
