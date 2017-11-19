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
SRCREV = "e3f4901ec07a957a19c9287a46b2f05da14f1f57"
S = "${WORKDIR}/git"
PV = "1.0.0+git${SRCPV}"

FILES_${PN} += " \
    ${libdir}/dssi \
"

# we are not linking against dssi - so
RDEPENDS_${PN} += "dssi"
