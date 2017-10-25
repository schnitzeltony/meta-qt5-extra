SUMMARY = "FluidPlug - SoundFonts as LV2 plugins via FluidSynth"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://source/FluidPlug.c;beginline=5;endline=15;md5=4932c97445ed4b8b2ce1203706e06a49"

# TODO: sf2 are downloaded from linuxaudio.org. There was no license information found so far

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

    # rename some files back
    cd ${D}${datadir}/sf2
    for file in `find -name 'Fluid*.sf2'`; do
        # All the fluid sf2s are based on Fluidr3
        newname=`echo $file | sed -e 's#Fluid#Fluidr3##'`
	    mv $file $newname
    done
}

FILES_${PN} += " \
    ${datadir}/sf2 \
    ${libdir}/lv2 \
"
