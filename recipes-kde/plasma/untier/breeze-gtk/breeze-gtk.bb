SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=1ed3208c1cce3d1926ccfc5bf65db050 \
"

inherit kde-plasma python3native

DEPENDS += "sassc-native cairo breeze python3-pycairo-native"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "b369b343d6dd4ef3af6d18340a83f308"
SRC_URI[sha256sum] = "4426839fb30cc088a1cedad4c542fc7c0d07a266c3c40ec03c0003ecdd10e3e5"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${datadir}/themes \
    ${libdir}/kconf_update_bin \
"
