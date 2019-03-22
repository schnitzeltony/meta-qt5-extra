SUMMARY = "A classic-analog style software synthesizer plugin"
HOMEPAGE = "http://dssi.sourceforge.net/download.html#Xsynth-DSSI"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

inherit autotools pkgconfig gtk-icon-cache

DEPENDS += " \
    gtk+ \
    dssi \
    liblo \
    ladspa-sdk \
"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/dssi/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-replace-missing-AM_PATH_GTK-by-PKG_CHECK_MODULES.patch \
"
SRC_URI[md5sum] = "3432ecdac06407a992f80eb1c1ecf7cd"
SRC_URI[sha256sum] = "d3d24941a509c6193eac2b2ee3c9a6057c832565a0b66e58c3bd2e89afd8dc02"

FILES_${PN} += " \
    ${libdir}/dssi \
"
