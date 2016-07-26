require ${BPN}.inc

inherit native

SRC_URI += "file://0002-build-knsintegrate-only-on-native.patch"

do_install() {
    install -d ${D}${bindir}
    install ${B}/libdiscover/backends/KNSBackend/knsintegrate/knsintegrate ${D}${bindir}
}

