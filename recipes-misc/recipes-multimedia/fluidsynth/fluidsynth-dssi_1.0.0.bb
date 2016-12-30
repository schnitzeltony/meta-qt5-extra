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
    ${SOURCEFORGE_MIRROR}/project/dssi/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-replace-missing-AM_PATH_GTK-by-PKG_CHECK_MODULES.patch \
"
SRC_URI[md5sum] = "6c9f660f0df4d2aad5076de75b2a0a67"
SRC_URI[sha256sum] = "e734d06d7e6d056a58c611a62e80b7cc6306b810137d9a19e260612e942fe049"

FILES_${PN} += " \
    ${libdir}/dssi \
"

# we are not linking against dssi - so
RDEPENDS_${PN} += "dssi"
