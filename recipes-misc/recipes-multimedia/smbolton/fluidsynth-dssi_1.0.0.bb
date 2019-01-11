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

SRC_URI = " \
    git://github.com/schnitzeltony/fluidsynth-dssi.git \
    file://fluidsynth-dssi.conf \
"
SRCREV = "001fdea313b923185b7bcb40d317b9a278191ba2"
S = "${WORKDIR}/git"
PV = "1.0.0+git${SRCPV}"

do_install_append() {
    install -d ${D}/${sysconfdir}/skel/.config/fluidsynth-dssi
    install -m 0644 ${WORKDIR}/fluidsynth-dssi.conf ${D}/${sysconfdir}/skel/.config/fluidsynth-dssi/
}

PACKAGES =+ "${PN}-defconfig"

FILES_${PN} += " \
    ${libdir}/dssi \
"

FILES_${PN}-defconfig = " \
    ${sysconfdir}/skel/.config/fluidsynth-dssi \
"

RDEPENDS_${PN}-defconfig += " \
    audio-tweaks \
"
