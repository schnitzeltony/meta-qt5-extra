SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=1ed3208c1cce3d1926ccfc5bf65db050 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "df9e1e3af2e658942ea1209ec1edde6f"
SRC_URI[sha256sum] = "c54879a55194dd9e63a3aa07f8b6fb7282ab8b14fdf6ac430f4dccbb722feb10"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${datadir}/themes \
    ${libdir}/kconf_update_bin \
"

FILES_${PN}-dbg += " \
    ${libdir}/kconf_update_bin/.debug \
"
