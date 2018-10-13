SUMMARY = "A wrapper for the FluidSynth, allowing it to function as a DSSI plugin"
HOMEPAGE = "http://dssi.sourceforge.net/download.html#FluidSynth-DSSI"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

inherit autotools pkgconfig gtk-icon-cache

DEPENDS += " \
    fluidsynth \
    gtk+ \
    dssi \
    liblo \
    ladspa-sdk \
"

SRC_URI = "git://github.com/schnitzeltony/fluidsynth-dssi.git"
SRCREV = "6ece68627f6a06b935361f4f06556fc03ef4fd1c"
S = "${WORKDIR}/git"
PV = "1.0.0+git${SRCPV}"

FILES_${PN} += " \
    ${libdir}/dssi \
"
