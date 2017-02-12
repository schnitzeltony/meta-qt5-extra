require ${BPN}.inc

inherit autotools pkgconfig native

DEPENDS += " \
    glib-2.0-native \
    lv2-native \
"

SRC_URI += " \
    file://0001-align-configuration-that-calfmakerdf-is-build-and-in.patch \
    file://0002-makerdf-fix-preset-file-name-in-manifest.patch \
"
