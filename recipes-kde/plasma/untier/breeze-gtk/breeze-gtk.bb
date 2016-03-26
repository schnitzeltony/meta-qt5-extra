SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=1ed3208c1cce3d1926ccfc5bf65db050 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "e46e9d3b90cf19b20afb4ec6789131e0"
SRC_URI[sha256sum] = "c64ca25c3a06d7f0303b58a3b9482f0af4fa8a98c0682919d57bdb3abe487062"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${datadir}/themes \
    ${libdir}/kconf_update_bin \
"

FILES_${PN}-dbg += " \
    ${libdir}/kconf_update_bin/.debug \
"
