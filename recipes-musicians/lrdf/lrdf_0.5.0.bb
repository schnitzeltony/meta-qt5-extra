SUMMARY = "Lightweight RDF"
DESCRIPTION = "A lightweight RDF library for accessing plugin metadata in the LADSPA plugin system"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

inherit autotools pkgconfig

DEPENDS = "raptor2"

SRC_URI = "git://github.com/swh/LRDF.git"
SRCREV = "1057b8e542f7dd27e3e591e93c07d58bd2143b76"
PV = "0.5.0+git${SRCPV}"
S = "${WORKDIR}/git"

do_install_append() {
    sed -i 's:${STAGING_INCDIR}:${includedir}:g' ${D}/${libdir}/pkgconfig/lrdf.pc
}

FILES_${PN} += "${datadir}/ladspa"
