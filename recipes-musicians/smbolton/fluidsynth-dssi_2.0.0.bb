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
    file://0001-Reduce-FSD_MAX_BURST_SIZE-512-128.patch \
    file://0002-Don-t-trash-unused-channels.patch \
    file://fluidsynth-dssi.conf \
"
SRCREV = "c9b41073031dc2ba99c43db1babc9bbfbab2ec1e"
S = "${WORKDIR}/git"
#PV = "2.0.0+git${SRCPV}"

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
