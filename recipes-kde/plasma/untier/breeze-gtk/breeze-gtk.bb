SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=1ed3208c1cce3d1926ccfc5bf65db050 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "9b3e9e33f7175c7991215a4793423117"
SRC_URI[sha256sum] = "5f63e047cc3ae280ff8fb2caf5f250c918ee1bdd7dc48cfd38b4e03d1334ae5a"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${datadir}/themes \
    ${libdir}/kconf_update_bin \
"

FILES_${PN}-dbg += " \
    ${libdir}/kconf_update_bin/.debug \
"
