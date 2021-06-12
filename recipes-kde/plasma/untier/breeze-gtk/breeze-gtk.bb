SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "BSD-3-Clause & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
"

inherit kde-plasma python3native

DEPENDS += "sassc-native cairo breeze python3-pycairo-native"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "2ce1f92d7cb3846f4b9ad6eb34fc1f7412f1b0e7cb75de38abed7c7e6a2a610f"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${datadir}/themes \
    ${libdir}/kconf_update_bin \
"
