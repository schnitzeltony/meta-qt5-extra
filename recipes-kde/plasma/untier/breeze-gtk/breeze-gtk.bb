SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=1ed3208c1cce3d1926ccfc5bf65db050 \
"

inherit kde-plasma python3native

DEPENDS += "sassc-native cairo breeze python3-pycairo-native"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c947d414522db82e726ce77ba3122163"
SRC_URI[sha256sum] = "bba00e94bad2b6f9baae19b1edba076785f45a94b591dd4b34f7b9104348cc3a"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${datadir}/themes \
    ${libdir}/kconf_update_bin \
"
