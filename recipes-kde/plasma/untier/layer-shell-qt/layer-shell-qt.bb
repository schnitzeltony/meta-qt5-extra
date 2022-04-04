SUMMARY = "Allow applications to make use of the Wayland wl-layer-shell protocol"
LICENSE = "BSD-3-Clause & CC0-1.0 & LGPL-3.0-or-later & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=f225922a2c12dfa5218fb70c49db3ea6 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-3.0-or-later.txt;md5=3000208d539ec061b899bce1d9ce9404 \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
"

inherit kde-plasma

DEPENDS += " \
    qtwayland-native \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "a0979fdb2f61a6d2c68fe2d93573d5b46597021600d748a379d18cb9af711e0f"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
