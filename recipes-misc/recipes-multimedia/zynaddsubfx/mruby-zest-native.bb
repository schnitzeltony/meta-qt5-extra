require ${BPN}.inc

inherit native

DEPENDS += " \
    libuv-native \
"

SRC_URI += "file://0004-Native-Do-not-build-X11-dependent-zest-libzest.so.patch"

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${B}/mruby/build/host/bin/mrbc ${D}${bindir}/mrbc-zest
}
