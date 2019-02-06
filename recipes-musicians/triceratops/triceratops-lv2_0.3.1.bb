SUMMARY = "Polyphonic synthesizer LV2 plugin"
HOMEPAGE = "http://thunderox.com/thor/?q=node/2"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += " \
    gtkmm \
    jack \
    lv2 \
    liblo \
"

inherit waf pkgconfig

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/triceratops/${BPN}-v${PV}.tar.gz;subdir=${BPN}-${PV} \
    file://0001-Replace-lv2core-by-lv2.patch \
"
SRC_URI[md5sum] = "cdd3e94b05247061820e17d7c3d900e4"
SRC_URI[sha256sum] = "0f678f2bebf5cd1e7aa3de82afa8bcbca64302cafb92d53dbb49143361517033"

EXTRA_OECONF = "\
    --libdir=${libdir} \
"

FILES_${PN} += " \
    ${libdir}/lv2 \
"
