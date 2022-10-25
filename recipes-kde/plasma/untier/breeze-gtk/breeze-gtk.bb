SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "BSD-3-Clause & CC0-1.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
"

inherit kde-plasma python3native

DEPENDS += "sassc-native cairo breeze python3-pycairo-native"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "c6dbe6ecd538d7ff8b97cfbeac2f0063aa209ffa22d4381a17ffd714a5b9fbde"

FILES:${PN} += " \
    ${datadir}/kconf_update \
    ${datadir}/themes \
    ${libdir}/kconf_update_bin \
"
