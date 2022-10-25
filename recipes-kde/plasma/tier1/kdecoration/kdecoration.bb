SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-plasma gettext

DEPENDS += " \
    kcoreaddons-native \
    kcoreaddons \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "81cc121f8105a2ea6bbd17047b2f795f1f79c1ee25006290ccf1c69da8ee854b"
