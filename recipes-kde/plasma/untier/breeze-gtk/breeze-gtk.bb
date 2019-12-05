SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=1ed3208c1cce3d1926ccfc5bf65db050 \
"

inherit kde-plasma python3native

DEPENDS += "sassc-native cairo breeze python3-pycairo-native"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "bb36249754ecdd0e254e67fef669ef37"
SRC_URI[sha256sum] = "fb64b95982b524a5646a9410b4906bf37cdd174162eba3ac6163ee347e27d424"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${datadir}/themes \
    ${libdir}/kconf_update_bin \
"
