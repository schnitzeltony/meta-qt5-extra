SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=1ed3208c1cce3d1926ccfc5bf65db050 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "93bab2eac8ce342cb8a0f79ac045bb54"
SRC_URI[sha256sum] = "1867bff15e5614d2b244a6c3938fef3c86ac09395e78da97aa391618f10b6d56"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${datadir}/themes \
    ${libdir}/kconf_update_bin \
"

FILES_${PN}-dbg += " \
    ${libdir}/kconf_update_bin/.debug \
"
